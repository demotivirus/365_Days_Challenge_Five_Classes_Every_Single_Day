package com.demotivirus.Day_024;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("{bookId}")
    public Book findById(@PathVariable Long bookId){
        return bookService.findById(bookId);
    }

    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.save(book);
    }

    @PutMapping
    public void saveBook(@RequestBody Book book){
        Book findById = bookService.findById(book.getId());
        bookService.save(findById);
    }

    @DeleteMapping("{bookId}")
    public void deleteById(@PathVariable Long bookId){
        bookService.deleteById(bookId);
    }
}
