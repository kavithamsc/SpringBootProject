package org.springboot.springbootwebapp.repositories;

import org.springboot.springbootwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
