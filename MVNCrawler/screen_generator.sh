#!/bin/bash

for i in {1..20}; do
  screen -S bfs_maven$i -dm bash -c "python bfs_maven$i.py --q q_items$i.txt --f projectList$i.csv"
done
