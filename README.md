# Spring Boot 3 Elastic Search

## swagger
    http://localhost:8080/api/

## h2 database console
    http://localhost:8080/h2-console

## elastic search
    docker network create elastic
    docker run --name es01 --net elastic -p 9200:9200 -e "discovery.type=single-node" -d docker.elastic.co/elasticsearch/elasticsearch:8.9.0

## other
    Google Java Format
    SonaLint
    Disable import * (Settings -> Editor -> Code Syle -> Java -> Imports)