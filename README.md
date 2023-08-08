# Spring Boot 3 Elasticsearch

## swagger
    http://localhost:8080/api/

## h2 database console
    http://localhost:8080/h2-console

## elastic search
    docker network create elastic
    docker run -d --name elasticsearch --net elastic -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:7.17.10

    7.17
    wsl -d docker-desktop
    sysctl -w vm.max_map_count=262144

    8.9
    https://localhost:9200
    bin/elasticsearch-setup-passwords interactive

## other
    Google Java Format
    SonaLint
    CheckStyle-IDEA
    Disable import * (Settings -> Editor -> Code Syle -> Java -> Imports)