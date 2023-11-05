from urllib.parse import urlparse, urljoin
from os.path import split, exists, join, isfile
import os
import csv
import random
import argparse
import requests

LIMIT = -1  # The number of JAR files to be extracted. -1 means unlimited
ARTIFACT_URL = "https://mvnrepository.com/artifact/"
MVN_LIST_FILE = "projectList.csv"    # excel file to store Maven project list
JAR_LIST_FILE = "jarList.csv"

def download_jar(url, path):
    response = requests.get(url)
    with open(path, 'wb') as jar_f:
        jar_f.write(response.content)

def read_project_list(file_path):
    data = []
    with open(file_path, 'r') as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            data.append(row)
    return data

def write_project_list(file_path, data):
    with open(file_path, 'a', newline='') as csv_file:
        csv_writer = csv.writer(csv_file)
        csv_writer.writerow(data)

def extract_files(limit, project_list):

    if not os.path.exists(project_list):
        print("No projectList")
    else:
        projects = read_project_list(project_list)
    
    rands = random.sample(range(1, len(projects)), limit)
    for cnt, rand in enumerate(rands, start=1):
        data = projects[rand]
        download_jar(data[6], join("jars", data[6].split("/")[-1]))
        print(cnt, data[6])        
        data[5] = urljoin(ARTIFACT_URL, str(data[1])+"/"+str(data[2])+"/"+str(data[3]))
        write_project_list(join("jars", JAR_LIST_FILE), data)

def main():
    parser = argparse.ArgumentParser(description="A crawler for gathering Maven coordinates and store them in a JSON file.")
    parser.add_argument("--l", default=LIMIT, type=int, help="The number of POM files to be extracted. -1 means unlimited")
    parser.add_argument("--f", default=MVN_LIST_FILE, type=str, help="A path to save the maven project list")

    args = parser.parse_args()

    extract_files(args.l, args.f)

if __name__ == "__main__":
    main()

