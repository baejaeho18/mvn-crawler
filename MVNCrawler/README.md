### 시작은 좋다.
maven의 자료들은 repo1에 잘 정리되어 있다. 
url 형식도 같아서 mvnrepository로 옮기기만 하면 조회도 간단하다.

### project list
repo1을 한번 dfs하면 만들어진다. 시간문제.

그 결과는 gson형식으로 /groupID/aftifactID/version이 될 것 같다. 
여기에 vulnerabilities로 cveID들만 넣어주면 된다. 
depth가 긴 것들은 어떻게 될지 궁금한데, 아마 .으로 들어가게 될 것 같다. 한번 돌려보면 확인은 쉬울 듯.<br>
문제 아닌 문제는 broad도 1000개가 넘는데 depth도 만만치 않아서 listing 하는데만도 한참 걸릴 것 같다. - 일단 ai.tock에만 6시간 소요되는 중

문제는 vuln을 어떻게 읽으냐다.
1) mvn에서 크롤링하는 것이 첫번째 설계. 이때 문제가 아래 동적페이지 크롤링에 산적해있다.
2) planB는 이에 대해 정리한 다른 데이터셋을 찾는 것. 시간이 걸릴 듯.
3) PlanC는 없는데.. 어떡하지...


### 동적페이지 크롤링
bs4+request : 정적페이지

bs4+selenium : 동적페이지

1) selenium 설치 - no modul found 아오 파이썬시치 - selenium 뜯어서 필요한 메소드 직접 구현하는 것으로 해결gogo
<br>https://wikidocs.net/137914
2) 로봇입니까? 관문 : user-agent추가 해보자. - 스무스하게 해결 - 은 개뿔 checkbox 처리해야함 - 그냥 재귀로 될 때까지 request 날리자
<br>https://power-of-optimism.tistory.com/627
![image](https://github.com/baejaeho18/mvn-crawler/assets/37645490/c80a7a07-2f1c-4da6-85f3-f50884286af6)

4) a.vuln으로 hidden class까지 읽을 수 있는가? - view more 버튼을 클릭해줘야 함 - eeeeasy
5) 
