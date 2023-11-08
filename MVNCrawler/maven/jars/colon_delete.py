with open("bytecode.txt", 'r') as read_file:
    with open("bytecode.txt", 'w') as out_file:
        content = read_file.read()
        content = content.replace(":", "").replace(";", "")
        out_file.write(content)
