package com.demotivirus.Day_021.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book getBookById(Integer id);
    void addBook(Book book);
    void deleteBook(Integer id);
}
