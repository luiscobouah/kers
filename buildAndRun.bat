@echo off
call mvn clean package
call docker build -t com.uah/KERS .
call docker rm -f KERS
call docker run -d -p 9080:9080 -p 9443:9443 --name KERS com.uah/KERS