package org.springboot.springbootwebapp.repositories;

import org.springboot.springbootwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
