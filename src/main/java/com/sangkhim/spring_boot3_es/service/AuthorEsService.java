package com.sangkhim.spring_boot3_es.service;

import com.sangkhim.spring_boot3_es.exception.BadRequestException;
import com.sangkhim.spring_boot3_es.exception.DataNotFoundException;
import com.sangkhim.spring_boot3_es.model.es.Author;
import com.sangkhim.spring_boot3_es.repository.es.AuthorEsRepository;
import com.sangkhim.spring_boot3_es.utils.Translator;
import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorEsService {

  private final AuthorEsRepository authorEsRepository;

  public List<Author> getAllAuthors() {
    return IterableUtils.toList(authorEsRepository.findAll());
  }

  public Author getById(Long id) {
    return authorEsRepository
        .findById(id)
        .orElseThrow(
            () ->
                new DataNotFoundException(
                    MessageFormat.format("Author id {0} not found", String.valueOf(id))));
  }

  public Author createOrUpdate(Author authorRequest) {
    Optional<Author> existingAuthor = authorEsRepository.findById(authorRequest.getId());

    if (existingAuthor.isPresent()) {
      Author authorUpdate = existingAuthor.get();

      authorUpdate.setName(authorRequest.getName());

      return authorEsRepository.save(authorUpdate);
    } else {
      return authorEsRepository.save(authorRequest);
    }
  }

  public void deleteById(Long id) {
    Optional<Author> author = authorEsRepository.findById(id);
    if (author.isPresent()) {
      authorEsRepository.deleteById(id);
    } else {
      throw new BadRequestException(Translator.toLocale("DELETE_ERROR_PLEASE_CHECK_ID"));
    }
  }
}
