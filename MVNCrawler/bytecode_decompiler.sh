#!/bin/bash

while getopts cdj opt
do
    case $opt in
        d)
        # dirList를 만든 후
        cmd.exe /C 'dir /s /b /ad "src/testcases" > dirList.txt'
        # # dirList에 따라 compile하고
        # dfiles=()
        # while read line;
        # do
        #     dfiles+=("$line")
        #     # echo "$line"
        # done < "dirList.txt"

        # for dfile in "${dfiles[@]}" do
        #     jfile=$(echo "$dfile/*.java")
        #     javac -cp ${lib} ${supports} -g ${jfile}
        # done
        # # classList를 만든 후
        # cmd.exe /C 'dir /s /b "src\testcases\*.class" > classList.txt'
        # # classList에 따라 decompile한다.
        # cfiles=()
        # while read line;
        # do
        #     cfiles+=("$line")
        #     # echo "$line"
        # done < "classList.txt"

        # for cfile in "${cfiles[@]}" do
        #     tfile="${cfile/.class/.txt}"
        #     javap -c -p ${cfile} > ${tfile} 
        # done
        ;;
        
        c)
        # classList를 만든 후
        # cmd.exe /C 'dir /s /b "*.class" > classList.txt'

        # classList에 따라 decompile한다.
        cfiles=()
        while read line;
        do
            cfiles+=("$line")
            # echo "$line"
        done < "classList.txt"

        for cfile in "${cfiles[@]}"; do
            cfile=$(echo "$cfile" | sed 's/\r//g')
            tfile="${cfile/.class/.txt}"
            javap -c -p ${cfile} > ${tfile} 
            javap -c -p ${cfile} >> "all_data.txt" 
        done
        ;;
        
        j)
        # javaList를 만든 후
        cmd.exe /C 'dir /s /b "src\testcases\*.java" > javaList.txt'

        # javaList에 따라 compile한다.
        # jfiles=()
        # while read line;
        # do
        #     jfiles+=("$line")
        #     # echo "$line"
        # done < "javaList.txt"

        # for jfile in "${jfiles[@]}" do
        #     javac -cp ${lib} ${supports} -g ${jfile}
        # done
        # # javaList에 따라 decompile한다.
        # for jfile in "${jfiles[@]}" do
        #     cfile="${jfile/.java/.class}"
        #     tfile="${jfile/.java/.txt}"
        #     javap -c -p ${cfile} > ${tfile} 
        # done
        ;;
        
        *) echo "$opt is not the option" ;;
    esac
done

