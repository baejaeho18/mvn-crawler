# mvn-crawler

## About
mvnCrawer는 크게 3가지 기능으로 구성되어 있다. 첫째, maven repository 오프소스 프로젝트에 등록된 프로젝트-버전들을 목록화한다. 둘째, 무작위로 선택한 프로젝트-버전에 보안 취약점이 존재하는지 검사한다. 셋째, 정해진 개수의 취약한 프로젝트와 안전한 프로젝트에서 Java 바이트코드를 추출한다.
그 결과, 무작위로 선택한 프로젝트 단위의 바이트코드가 보안 취약점 내포 여부를 라벨로 하여 데이터셋이 만들어진다. 

## Environment
- Python 3.5 or newer
- request 2.31.0
- urllib 1.26.16
- beautifulsoup 4.12.2
- selenium 4.14.0
- queuelib 1.6.2

## Usage
git clone https://github.com/ISEL-HGU/mvn-crawler.git

### bfs_maven.py
Apache Maven 중앙 저장소(Central Repository)[i]에 jar파일이 존재하는 모든 프로젝트의 각 버전들을 목록화하여 저장하는 스크립트이다.
실행 명령어 : 
python bfs_maven.py --q q_items --f projectList.csv --p maven
3,500만 여개의 프로젝트-버전이 저장되어 있는 만큼 BFS(Breadth-First Search)를 완료하기까지 오랜 시간이 걸린다. screen을 다량 만드는 것을 추천한다. 그 과정에서 옵션을 조정하고 싶을 때, python dfs_maven.py --h 명령어를 입력하면 자세한 설명을 읽을 수 있다.

### crawler.py
bfs_maven.py를 실행하여 얻은 projectList.csv에서 무작위로 선택한 프로젝트-버전의 보안 취약점 내포 여부를 확인하고, 필요한 프로젝트일 경우 jar 배포파일은 저장하여 바이트코드로 변환 및 저장하는 스크립트이다.
python crawler.py --s full --f projectList.csv --p jars --l 200 --v 0.5 --c 10
projectList.csv(--file 옵션)에서 무작위로 선택한 프로젝트가 보안취약점을 가지고 있는지 확인한다. 판별 결과가 누적 200(--limit 옵션)x0.5(--vul_ratio 옵션)개를 넘지 않았다면, ,jars(--path 옵션) 디렉토리에 jar 파일을 저장 및 압축 해제 후 바이트코드로 변환하여 프로젝트-버전을 파일명으로 하는 텍스트 파일에 저장한다. 이 과정에서 무작위로 선택한 프로젝트의 index 값을 randon_set.txt에 저장하여 프로젝트가 중복되지 않도록 한다. 또한 판별된 프로젝트-버전은 보안 취약점 내포 여부를 labeling하여 각각 vulList.csv와 clnList.csv에 저장한다.
python crawler.py --s check --f projectList.csv --l 200 --c 10
위의 기능을 full로 하지 않고 보안 취약점 내포 여부만을(--select 옵션) 검사하는 명령어이다. 위와 마찬가지로 projectList.csv에서 random_set과 겹치지 않는 무작위 프로젝트-버전을 판별하여 vulList.csv와 clnList.csv에 각각 저장한다. 이때, limit 옵션을 입력하지 않으면 default로 -1이 입력되어 정해진 개수가 아닌 입력파일 내의 모든 항목을 검사한다. 판별을 위해 maven 웹사이트[j]에 접속하는 과정에서 에러가 발생한다면 10초 동안 대기(--cooldown 옵션) 후 동일한 url로 다시 질의한다. 만약 5회 이상 동일한 url을 반복한다면 err 로그를 남기고 다음 항목으로 넘어간다.
python crawler.py --s down --f projectList.csv --p jars
입력 받은 projectList.csv(--file 옵션)의 maven 저장소 url에서 jar 파일을 jars 디렉토리(--path 옵션)에 저장 및 압축해제한다(--select 옵션). 압축 해제된 프로젝트-버전명을 이름으로 하는 디렉토리 내의 모든 class 파일들을 바이트코드로 disassemble한 후, 프로젝트 단위의 하나의 텍스트 파일로 이어붙인다.

## Output Format
projectList.csv
random_set.txt
vulList.csv
Figure 19: vulList.csv
clnList.csv
Figure 20: clnList.csv
bytecode.txt
Figure 21: bytecode.txt
label.csv
Figure 22 : label.csv




# Old one
## Help from Maven Crawler
⚠ Archived repository: this repository is now archive. It has been superseded by [Incremental Maven Crawler](https://github.com/fasten-project/incremental-maven-crawler).

[![PyPI version](https://badge.fury.io/py/mvncrawler.svg)](https://badge.fury.io/py/mvncrawler)

This is a tool for crawling Maven repositories and gathering Maven coordinates.
It can be used for research and education purposes.

## Requirements
- Python 3.5 or newer

## Usage
```
mvncrawler --p ./maven/ --q q_items.txt --c 5 --l 10
```
It extracts 10 Maven coordinates. 
- Use `--help` option to see the description of each arguments.
- You can remove `--l 10` option to extract Maven coordinates without a limit.

```
dir /s /b "*.class" > classList.txt
```
Listing the class files which downloaded and unzipped by mvncrawler.

```
bash bytecode_decompiler.sh -c
```
Deassembling the class files in classList.txt to txt files.


## Output format
Extracted Maven coordinates are converted to a JSON-compatible string as shown and described below:
```
{"groupId": "com.yahoo.vespa", "artifactId": "zookeeper-server-common", "version": "7.171.10", "date": "1580860140", "url": "https://repo1.maven.org/maven2/com/yahoo/vespa/zookeeper-server-common/7.171.10/zookeeper-server-common-7.171.10.pom"}
```

- `groupId`: The specified groupID in a JAR file.
- `artifactId`: The specified artifactID in a JAR file.
- `version`: The version of a Maven package as specified in its JAR file.
- `date`: The release date of a Maven package in Unix epoch format.
- `url`: The URL of a JAR file on the Maven server.
