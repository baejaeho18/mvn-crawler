import csv
from collections import defaultdict

# CSV 파일 경로
csv_file = 'your_file.csv'  # 파일 경로를 적절히 수정하세요

# 두 번째 열 값의 반복 횟수를 저장할 딕셔너리
value_counts = defaultdict(int)

# CSV 파일 열기
with open(csv_file, 'r') as csvfile:
    csv_reader = csv.reader(csvfile)
    
    # 첫 행은 헤더일 경우, 건너뛸 수 있습니다.
    next(csv_reader, None)
    
    # CSV 파일을 읽어서 두 번째 열 값의 반복 횟수를 계산
    for row in csv_reader:
        if len(row) > 1:  # 두 번째 열이 존재하는 경우
            value = row[1]  # 두 번째 열 값 가져오기
            value_counts[value] += 1  # 딕셔너리에 반복 횟수 추가

# 결과 출력
for value, count in value_counts.items():
    print(f'값: {value}, 반복 횟수: {count}')
