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
# CACH_URL = "https://webcache.googleusercontent.com/search?q=cache:"
ARTIFACT_URL = "https://mvnrepository.com/artifact/"
JSON_OUTPUT_FILE = "mvn_coords.json"  # JSON file to store Maven coordinates
MVN_LIST_FILE = "projectList.csv"    # excel file to store Maven project list

class PageLink:
    def __init__(self, url, file_h, timestamp):
        self.url = url
        self.file_h = file_h
        self.timestamp = timestamp

def url_last_part(url):
    return split(urlparse(url).path)[-1]

def is_url_file(url):
    return bool(re.match(r".+\.\w+", url_last_part(url)))

def download_jar(url, path):
    response = requests.get(url)
    with open(path, 'wb') as jar_f:
        jar_f.write(response.content)

def save_queue(items, path):
    with open(path, 'w', newline="") as f:
        writer = csv.writer(f)
        writer.writerows(items)

def load_queue(path):
    with open(path, 'r') as f:
        reader = csv.reader(f)
        items = [PageLink(i[0], i[1], i[2]) for i in reader]
    return items

def extract_files(url, dest, queue_file, cooldown, limit, vul_ratio, list_file):
    if exists(queue_file):
        q = deque(load_queue(queue_file))
        print("Loaded the queue items from the file...")
    else:
        links_list = [PageLink(urljoin(url, u['href']), u['href'], u.next_sibling.strip()) for u in extract_page_links(url)[1:]]
        q = deque(links_list)
        save_queue([[i.url, i.file_h, i.timestamp] for i in links_list], queue_file)
        print("Downloaded and saved the queue....")

    num_jar = 0
    limit_condition = lambda: num_jar < limit if limit > 0 else lambda: True

    json_coords = []

    while len(q) != 0 and limit_condition():
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
            print(u.file_h)
            paths = u.file_h.split("/")
            
            mvn_coords = {'category':'', 'groupId': ".".join(paths[:-3]), 'artifactId': paths[-3], 'version': paths[-2], 'date': u.timestamp, 'vulnerabilities':'', 'url': u.url}

            with open(join(dest, list_file), 'a') as p:
                p.write(mvn_coords['category']+","+mvn_coords['groupId']+","+mvn_coords['artifactId']+","+mvn_coords['version']+","+mvn_coords['date']+","+mvn_coords['vulnerabilities']+","+mvn_coords['url']+"\n")
            num_jar += 1

        save_queue([[items.url, items.file_h, items.timestamp] for items in list(q)], queue_file)

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
    parser.add_argument("--v", default=VUL_RATIO, type=float, help="The ratio of vulnerable projects to store")
    parser.add_argument("--f", default=MVN_LIST_FILE, type=str, help="A path to save the maven project list")

    args = parser.parse_args()

    extract_files(args.m, args.p, args.q, args.c, args.l, args.v, args.f)

if __name__ == "__main__":
    main()
