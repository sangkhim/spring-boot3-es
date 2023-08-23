package com.sangkhim.spring_boot3_es.repository.es;

import com.sangkhim.spring_boot3_es.model.es.Author;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends ElasticsearchRepository<Author, Long> {}
