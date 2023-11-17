content = ""
for cnt in range(13,21):
    with open(f"projectList{cnt}.csv", 'r') as input:
        content = input.read()
    with open("projectList13_20.csv", "a") as output:
        output.write(content)

# with open(f"projectList4.txt", 'r') as input:
#    content = input.read()
# with open("projectList.csv", "a") as output:
#    output.write(content)      
