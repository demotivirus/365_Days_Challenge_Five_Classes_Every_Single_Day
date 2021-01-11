package com.demotivirus.Day_021.Book;

import com.demotivirus.Day_021.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @GetMapping("{bookId}")
    public Book getBookById(@PathVariable Integer bookId){
        checkBook(bookId);
        return bookService.getBook(bookId);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @DeleteMapping("")
    public void deleteBookById(@PathVariable Integer bookId){
        checkBook(bookId);
        bookService.deleteBook(bookId);
    }

    private void checkBook(Integer bookId){
        if(bookService.getBook(bookId) == null)
            throw new NotFoundException("Book id not found: " + bookId);
    }
}
