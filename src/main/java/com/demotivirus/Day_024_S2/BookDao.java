package com.demotivirus.Day_024_S2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "books")
public interface BookDao extends JpaRepository<Book, Long> {
}
