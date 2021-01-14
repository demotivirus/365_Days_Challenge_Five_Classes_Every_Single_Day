package com.demotivirus.Day_024;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long bookId);
    void save(Book book);
    void deleteById(Long bookId);
}
