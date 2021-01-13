package com.demotivirus.Day_021.Book;

import com.demotivirus.Day_021.NotFoundException;
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

    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookDao.findAll();
    }

    @GetMapping("{bookId}")
    public Book getBookById(@PathVariable Integer bookId){
        checkBook(bookId);
        return bookDao.getOne(bookId);
    }

    /**
     * Set headers:
     * Content-Type
     * application/json
     **/
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookDao.save(book);
    }

    @PutMapping("{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable Integer bookId){
        Book existsBook = bookDao.findById(bookId)
                .orElseThrow(() -> new NotFoundException("Book not found " + bookId));
        existsBook.setTitle(book.getTitle());
        existsBook.setAuthor(book.getAuthor());
        return bookDao.save(existsBook);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        Book existsBook = bookDao.findById(book.getId())
                .orElseThrow(() -> new NotFoundException("Book not found " + book.getId()));
        existsBook.setTitle(book.getTitle());
        existsBook.setAuthor(book.getAuthor());
        return bookDao.save(existsBook);
    }

    @DeleteMapping("{bookId}")
    public void deleteBookById(@PathVariable Integer bookId){
        checkBook(bookId);
        bookDao.deleteById(bookId);
    }

    private void checkBook(Integer bookId){
        if(bookDao.getOne(bookId) == null)
            throw new NotFoundException("Book id not found: " + bookId);
    }
}
