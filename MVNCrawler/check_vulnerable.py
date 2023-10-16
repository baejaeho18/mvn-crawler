from pickle import TRUE
from bs4 import BeautifulSoup
from urllib.request import urlopen
from urllib.parse import urlparse, urljoin
from urllib.error import URLError
from os.path import split, exists, join, isfile
from collections import deque
from os import makedirs
from datetime import datetime
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

def what_jar_vulnerable(path):
    driver = webdriver.Chrome()
    driver.get(path)

    try:
        # table grid 있으면 pass
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

if __name__ == "__main__":
    what_jar_vulnerable("https://mvnrepository.com/artifact/com.brandwatch/robots-core/1.2.1")
    # what_jar_vulnerable("https://mvnrepository.com/artifact/junit/junit/4.13")
