package com.demotivirus.Day_024;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "members")
public interface BookDao {
    List<Book> findAll();
    Book findById(Long bookId);
    void save(Book book);
    void deleteById(Long bookId);
}
