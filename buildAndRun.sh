#!/bin/sh
mvn clean package && docker build -t com.uah/KERS .
docker rm -f KERS || true && docker run -d -p 9080:9080 -p 9443:9443 --name KERS com.uah/KERS