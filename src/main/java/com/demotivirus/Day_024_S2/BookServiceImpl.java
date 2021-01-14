package com.demotivirus.Day_024_S2;

import com.demotivirus.Day_024_S2.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findById(Long bookId) {
        Optional<Book> res = bookDao.findById(bookId);
        Book book;
        if (res.isPresent())
            return book = res.get();
        else throw new NotFoundException("Book not found with id " + bookId);
    }

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public void deleteById(Long bookId) {
        Optional<Book> res = bookDao.findById(bookId);
        if (res.isPresent())
            bookDao.deleteById(bookId);
        else throw new NotFoundException("Book not found with id " + bookId);
    }
}
