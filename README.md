# mvn-crawler
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
