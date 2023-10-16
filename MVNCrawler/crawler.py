from pickle import TRUE
from bs4 import BeautifulSoup
from urllib.request import urlopen
from urllib.parse import urlparse, urljoin
from urllib.error import URLError
from os.path import split, exists, join, isfile
from collections import deque
from datetime import datetime
from os import makedirs
import os
import re
import csv
import time
import json
import random
import zipfile
import argparse
import requests
import subprocess

# selenium의 webdriver를 사용하기 위한 import
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


MVN_URL = "https://repo1.maven.org/maven2/"
MVN_PATH = "./maven/" # Path to save the Maven repos
QUEUE_FILE = "q_items.txt"  # CSV file to store queue items
COOLDOWN = 5.0  # How long the crawler waits before sending a request (in seconds)
LIMIT = -1  # The number of JAR files to be extracted. -1 means unlimited
VUL_RATIO = 1.0
CACH_URL = "https://webcache.googleusercontent.com/search?q=cache:"
ARTIFACT_URL = "https://mvnrepository.com/artifact/"
JSON_OUTPUT_FILE = "mvn_coords.json"  # JSON file to store Maven coordinates

class PageLink:
    def __init__(self, url, file_h, timestamp):
        self.url = url
        self.file_h = file_h
        self.timestamp = timestamp

def url_last_part(url):
    return split(urlparse(url).path)[-1]

def is_url_file(url):
    return bool(re.match(r".+\.\w+", url_last_part(url)))

def download_pom(url, path):
    response = requests.get(url)
    with open(path, 'wb') as pom_f:
        pom_f.write(response.content)

def download_jar(url, path):
    response = requests.get(url)
    with open(path, 'wb') as jar_f:
        jar_f.write(response.content)

def convert_to_unix_epoch(datetime_str):
    date, time = datetime_str.split(" ")
    year, month, day = date.split("-")
    hour, min = time.split(":")
    return int(datetime(int(year), int(month), int(day), int(hour), int(min)).timestamp())

def process_pom_file(path):
    pom_file = open(path, 'rb').read()
    os.remove(path)
    soup = BeautifulSoup(pom_file)
    group_id = None
    version = soup.find('version')
    artifact_id = None

    for g in soup.find_all('groupid'):
        if g.parent.name == 'project':
            group_id = g
            break
        elif g.parent.name == 'parent':
            group_id = g

    for a in soup.find_all('artifactid'):
        if a.parent.name == 'project':
            artifact_id = a
            break

    if group_id is not None and artifact_id is not None and version is not None:
        return {'groupId': validate_str(group_id.get_text()), 'artifactId': validate_str(artifact_id.get_text()),
                'version': validate_str(version.get_text()), 'date': '', 'url': '', 'category':'', 'vulnerabilities':''}
    else:
        return None

def validate_str(str):
    return ''.join(str.split())

def save_queue(items, path):
    with open(path, 'w', newline="") as f:
        writer = csv.writer(f)
        writer.writerows(items)

def load_queue(path):
    with open(path, 'r') as f:
        reader = csv.reader(f)
        items = [PageLink(i[0], i[1], i[2]) for i in reader]
    return items

def what_jar_vulnerable(path):
    driver = webdriver.Chrome()
    driver.get(path)

    try:
        # table grid 있으면 web접속 성공
        vuln = WebDriverWait(driver, 1).until(
            EC.presence_of_element_located((By.XPATH, "/html/body/div/main/div[1]/table"))
        )
    except :
        # bot-checker로 간주
        print("repeat by bot-checker")
        return what_jar_vulnerable(path)

    # vuln.more 버튼 있으면 클릭한 후
    try:
        driver.find_element(By.CSS_SELECTOR, ".vuln.more").click()
    except:
        pass
    
    # vuln 목록 받기
    vulns = driver.find_elements(By.CLASS_NAME, "vuln")    
    cveIDs = []
    for vuln in vulns:
        text = vuln.text
        if "CVE" in text:
            cveIDs.append(text)
            print(text)
    return cveIDs

def decompile_project(path):
    for class_file in os.listdir(path):
        if class_file.endswith(".class"):
            class_file_path = os.path.join(path, class_file)
            result = subprocess.run(["javap", "-c", "-p", class_file_path], stdout=subprocess.PIPE, text=True, check=True)
            decompiled_code = result.stdout
            with open(class_file_path.replace(".class", ".txt"), 'w') as txt:
                txt.write(decompiled_code)
            with open('all_data.txt', 'a') as integrate_f:
                integrate_f.write(decompiled_code)


def extract_files(url, dest, queue_file, cooldown, limit, vul_ratio):
    if exists(queue_file):
        q = deque(load_queue(queue_file))
        print("Loaded the queue items from the file...")
    else:
        links_list = [PageLink(urljoin(url, u['href']), u['href'], u.next_sibling.strip()) for u in extract_page_links(url)[1:]]
        q = deque(links_list)
        save_queue([[i.url, i.file_h, i.timestamp] for i in links_list], queue_file)
        print("Downloaded and saved the queue....")

    num_vul_jar = 0
    num_cln_jar = 0
    max_vul_jar = int(limit * vul_ratio)
    max_cln_jar = limit - max_vul_jar
    # num_pom_ext = 0
    # limit_condition = lambda: num_pom_ext < limit if limit > 0 else lambda: True
    
    json_coords = []

    while len(q) != 0 :# and num_vul_jar + num_cln_jar < limit:
        u = q.popleft()
        if not is_url_file(u.url):
            if not exists(join(dest, u.file_h)):
                makedirs(join(dest, u.file_h))
            time.sleep(cooldown)
            page_links = extract_page_links(u.url)
            if page_links is not None:
                for pl in page_links[1:]:
                    q.appendleft(PageLink(urljoin(u.url, pl['href']), join(u.file_h, pl['href']), pl.next_sibling.strip()))
        elif bool(re.match(r".+\.jar$", u.url)) and not bool(re.match(r".+-sources\.jar$", u.url)) and not bool(re.match(r".+-javadoc\.jar$", u.url)):
            # 무작위 요소 추가 - 유사 circular queue
            # if random.randint(1, 10) != 1:
            #     q.append(u)
            #     continue

            # pom for record
            pom_url = u.url.replace(".jar", ".pom")
            pom_file_h = u.file_h.replace(".jar", ".pom")
            if not isfile(join(dest, pom_file_h)):
                download_pom(pom_url, join(dest, pom_file_h))
                print("Downloaded %s" % join(dest, pom_file_h))
            else:
                print("File %s exists." % join(dest, pom_file_h))

            mvn_coords = process_pom_file(join(dest, pom_file_h))

            if mvn_coords is not None:
                mvn_coords['date'] = u.timestamp
                mvn_coords['url'] = u.url
                print("cord: %s | t: %s " % (mvn_coords['groupId'] + ":" + mvn_coords['artifactId'] + ":" + mvn_coords['version'], mvn_coords['date']))
                json_coords.append(mvn_coords)

            # vulnerable한지 확인하는 process
            # cveIDs = what_jar_vulnerable(urljoin(ARTIFACT_URL, mvn_coords['groupId']+"/"+mvn_coords['artifactId']+"/"+mvn_coords['version']))
            # if len(cveIDs) > 0:
            #     if num_vul_jar >= max_vul_jar:
            #         continue
            #     num_vul_jar += 1
            #     mvn_coords['category'] = "Vulnerable"
            #     mvn_coords['vulnerabilities'] = cveIDs
            #     print(" Vulnerable Project "+str(num_vul_jar))
            # else:
            #     if num_cln_jar >= max_cln_jar:
            #         print("continue..")
            #         continue
            #     num_cln_jar += 1
            #     mvn_coords['category'] = "Clean"
            #     print(" Clean Project "+str(num_cln_jar))

            # if not isfile(join(dest, u.file_h)):
            #     download_jar(u.url, join(dest, u.file_h))
            #     print("Downloaded %s" % join(dest, u.file_h))
            # else:
            #     print("File %s exists." % join(dest, u.file_h))
                
            # # unzip jar project
            # zipfile.ZipFile(join(dest, u.file_h)).extractall(join(dest, u.file_h).replace(".jar", ""))
            # decompile_project(join(dest, u.file_h).replace(".jar", ""))
            with open(join(dest, 'projectList.csv'), 'a') as p:
                p.write(mvn_coords['category']+","+mvn_coords['groupId']+","+mvn_coords['artifactId']+","+mvn_coords['version']+","+mvn_coords['date']+","+mvn_coords['vulnerabilities']+","+mvn_coords['url']+"\n")

        save_queue([[items.url, items.file_h, items.timestamp] for items in list(q)], queue_file)

    # JSON 파일에 Maven 좌표 데이터 저장
    with open(join(dest, JSON_OUTPUT_FILE), 'w') as json_file:
        json.dump(json_coords, json_file)
    # print("vul:"+str(num_vul_jar)+", cln:"+str(num_cln_jar))

def extract_page_links(url):
    try:
        page_content = urlopen(url).read()
        soup = BeautifulSoup(page_content, 'html.parser')
        return soup.find_all('a', href=True)
    except URLError:
        print("Cannot explore this path: %s" % url)
        return None

def main():
    parser = argparse.ArgumentParser(description="A crawler for gathering Maven coordinates and store them in a JSON file.")
    parser.add_argument("--m", default=MVN_URL, type=str, help="The URL of Maven repositories")
    parser.add_argument("--p", default=MVN_PATH, type=str, help="A path to save the JAR files on the disk")
    parser.add_argument("--q", default=QUEUE_FILE, type=str, help="The file of queue items")
    parser.add_argument("--c", default=COOLDOWN, type=float, help="How long the crawler waits before sending a request (in sec.)")
    parser.add_argument("--l", default=LIMIT, type=int, help="The number of POM files to be extracted. -1 means unlimited")
    parser.add_argument("--v", default=VUL_RATIO, type=float, help="The ratio of vulnerable projects to store.")

    args = parser.parse_args()

    extract_files(args.m, args.p, args.q, args.c, args.l, args.v)

if __name__ == "__main__":
    main()
