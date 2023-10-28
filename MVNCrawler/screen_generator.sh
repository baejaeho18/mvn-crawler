#!/bin/bash

for i in {4..20}; do
  screen -S bfs$i -dm bash -c "python bfs_maven.py --q q_items$i.txt --f projectList$i.csv"
done
