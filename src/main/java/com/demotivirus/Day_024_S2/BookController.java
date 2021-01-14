package com.demotivirus.Day_024_S2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping
    public List<Book> findAll(){
        return bookDao.findAll();
    }

    @GetMapping("{bookId}")
    public void findById(@PathVariable Long bookId){
        bookDao.findById(bookId);
    }

    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookDao.save(book);
    }

    @PutMapping
    public void saveBook(@RequestBody Book book){
        bookDao.save(book);
    }

    @DeleteMapping("{bookId}")
    public void deleteById(@PathVariable Long bookId){
        bookDao.deleteById(bookId);
    }
}
