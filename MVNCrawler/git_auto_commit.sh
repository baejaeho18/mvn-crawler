#!/bin/bash

# 이 스크립트는 원하는 디렉토리로 이동한 후 Git 작업을 수행합니다.
cd /data/jaeho/mvn-crawler2/MVNCrawler

# Git 작업 수행
git add *
git commit -m "regular reporting"
git push origin main

