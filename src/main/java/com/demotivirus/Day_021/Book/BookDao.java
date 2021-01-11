package com.demotivirus.Day_021.Book;

import java.util.List;

public interface BookDao {
    List<Book> getBooks();
    Book getBook(Integer id);
    void saveBook(Book book);
    void deleteBook(Integer id);
}
