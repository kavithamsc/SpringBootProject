package org.springboot.springbootwebapp.repositories;

import org.springboot.springbootwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
