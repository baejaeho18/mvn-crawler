import os
import re
import zipfile
import subprocess

OUTPUT_FILE = "bytecode.txt"

def getsize(file_size):
    count = 0
    units  ={0:'B', 1:'KB', 2:'MB', 3:'GB', 4:'TB'}
    while file_size > 1024:
        file_size /= 1024
        count += 1
    
    return f"{file_size: .1f} {units[count]}"

def unzip_jar(path):
    # 추출된 JAR 파일을 검사하여 중첩된 JAR 파일이 있는지 확인
    for root, _, files in os.walk(path):
        for file in files:
            if file.endswith('.jar'):
                jar_file_path = os.path.join(root, file)
                extracted_dir = jar_file_path.replace(".jar", "")
                with zipfile.ZipFile(jar_file_path, 'r') as zip_ref:
                    zip_ref.extractall(extracted_dir)
                unzip_jar(extracted_dir)

def decompile_project(path):
    cnt = 0
    for root, _, files in os.walk(path):
        for class_file in files:
            if class_file.endswith('.class'):
                cnt += 1
                class_file_path = os.path.join(root, class_file)
                result = subprocess.run(["javap", "-c", "-p", class_file_path], stdout=subprocess.PIPE, text=True, check=True)
                decompiled_code = result.stdout

                pattern = re.compile(r'Compiled from .+\n|\s*//.*\n|\s*/\*.*?\*/', re.MULTILINE)
                code_cleaned = re.sub(pattern, '\n', decompiled_code)

                with open(class_file_path.replace(".class", ".txt"), 'w') as txt:
                    txt.write(decompiled_code)
                with open(OUTPUT_FILE, 'a') as integrate_f:
                    integrate_f.write(code_cleaned)
    return cnt, os.path.getsize(OUTPUT_FILE)


unzip_jar("./")
total_size = 0
total_cnt = 0
project_cnt = 0
for pathes in os.listdir("./"):
    if not os.path.isfile(pathes):
        project_cnt += 1
        print(str(project_cnt).rjust(4, ' '), "|", str(pathes).ljust(42,' '), "|", end=" ")
        file_cnt, current_size = decompile_project(pathes)
        file_size = current_size - total_size
        total_size = current_size
        total_cnt += file_cnt
        print(str(file_cnt).rjust(6, ' '), "|", str(getsize(file_size)).rjust(9,' '))
        with open("log.txt", 'a') as f:
            f.write(str(project_cnt).rjust(4, ' ')+" | "+str(pathes).ljust(42,' ')+" | "+str(file_cnt).rjust(6, ' ')+" | "+str(getsize(file_size)).rjust(9,' '))
print(f"total({project_cnt}) |", str(total_cnt).rjust(6, ' '), "|", str(getsize(total_size)).rjust(9,' '))
with open("log.txt", 'a') as f:
    f.write(f"total({project_cnt}) | "+str(total_cnt).rjust(6, ' ')+" | "+str(getsize(total_size)).rjust(9,' '))

