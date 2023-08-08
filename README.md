# Spring Boot 3 Elasticsearch

## swagger
    http://localhost:8080/api/

## h2 database console
    http://localhost:8080/h2-console

## elastic search
    docker network create elastic
    docker run --name es01 --net elastic -p 9200:9200 -e "discovery.type=single-node" -d docker.elastic.co/elasticsearch/elasticsearch:8.9.0
    https://localhost:9200
    sudo bin/elasticsearch-setup-passwords interactive

## other
    Google Java Format
    SonaLint
    CheckStyle-IDEA
    Disable import * (Settings -> Editor -> Code Syle -> Java -> Imports)