package com.sangkhim.spring_boot3_es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sangkhim.spring_boot3_es.repository.jpa")
@EnableElasticsearchRepositories("com.sangkhim.spring_boot3_es.repository.es")
public class SpringBoot3ElasticsearchApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBoot3ElasticsearchApplication.class, args);
  }
}
