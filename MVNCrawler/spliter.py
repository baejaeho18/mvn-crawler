# 첫 번째 파일에 저장할 줄 수
lines_to_save_first = 686

# 나머지 파일에 저장할 줄 수
lines_to_save_per_file = 600

# 원본 파일명
original_file = 'q_items9.txt'

# 파일명 형식을 정의합니다.
output_file_format = 'q_items{}.txt'

# 첫 번째 파일을 열고 쓸 준비를 합니다.
with open(original_file, 'r') as infile:
    # 첫 번째 파일
    with open(output_file_format.format(6), 'w') as outfile:
        for _ in range(lines_to_save_first):
            line = infile.readline()
            outfile.write(line)

# 나머지 파일들을 열고 쓸 준비를 합니다.
for i in range(7, 9):
    with open(original_file, 'r') as infile:
        with open(output_file_format.format(i), 'w') as outfile:
            # 첫 99줄을 건너뛸 준비를 합니다.
            for _ in range(lines_to_save_first):
                infile.readline()
            # 자른 줄을 건너뜁니다.
            for _ in range((i-7)*lines_to_save_per_file):
                infile.readline()
            # 나머지 줄을 복사합니다.
            for _ in range(lines_to_save_per_file):
                line = infile.readline()
                outfile.write(line)
