#!/usr/bin/bash

git clone https://github.com/amanchourasia/JenkinsWar.git
git clone http://rig:${rig_password}@${BB_URL}/scm/DEM/app.git
cp -r ./JenkinsWar/* ./app
cd app
git init
git add --all
git commit -m"initial commit"
git push -u origin master
