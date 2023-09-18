# Spring Boot 3 Elasticsearch

## swagger

    http://localhost:8080/api/

## h2 database console

    http://localhost:8080/h2-console

## elastic search

    https://hub.docker.com/_/elasticsearch/

    docker network create elastic
    docker run -d --name elasticsearch --net elastic -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:7.17.10

    version 7
    wsl -d docker-desktop
    sysctl -w vm.max_map_count=262144

    version 8
    https://localhost:9200
    bin/elasticsearch-setup-passwords interactive

## gravitee

    https://medium.com/graviteeio/getting-gravitee-io-api-management-platform-up-and-running-on-a-local-machine-9408d07221e6
    https://community.gravitee.io/t/elasticsearch-has-stopped-working/274/23
    
    curl https://raw.githubusercontent.com/gravitee-io/gravitee-docker/master/apim/3.x/docker-compose.yml -o docker-compose.yml
    change version to 3.16.1

    docker-compose up

## other

    EnvFile
    Google Java Format
    SonaLint
    CheckStyle-IDEA
    GitHub Copilot
    Disable import * (Settings -> Editor -> Code Syle -> Java -> Imports)