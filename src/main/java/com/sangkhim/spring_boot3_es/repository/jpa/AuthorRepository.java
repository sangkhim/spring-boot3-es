package com.sangkhim.spring_boot3_es.repository.jpa;

import com.sangkhim.spring_boot3_es.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {}
