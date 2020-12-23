package com.demotivirus.Day_002_S2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@ToString
public class Library {
    private Map<Book, Integer> books = new HashMap<>();
    private Map<Reader, Book> readers = new HashMap<>();

    public void setBook(Book book, Integer quantity) {
        if (books.containsKey(book)) {
            int numberOfBooks = books.get(book);
            books.put(book, numberOfBooks + quantity);
        } else books.put(book, quantity);
    }

    public void putBook(Book book, Integer quantity) {
        setBook(book, quantity);
    }

    public Book getBookByTitle(String title) {
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            if (entry.getKey().getTitle().equals(title)) {
                int numbersOfBook = entry.getValue();
                numbersOfBook--;
                books.put(entry.getKey(), numbersOfBook);
                return entry.getKey();
            }
        }
        return null;
    }

    public void printAllBooks() {
        System.out.println("=========BOOKS ON LIBRARY=========");
        books.forEach((k, v) -> System.out.println(k + " books on library: " + v));
        System.out.println("==================================");
    }

    public void takeBook(Reader reader, String titleOfBook) {
        readers.put(reader, getBookByTitle(titleOfBook));
        System.out.println(reader + " take a book " + titleOfBook);
    }

    public void takeBook(Reader reader, Book book){
        if (books.containsKey(book)){
            readers.put(reader, book);
            for (Map.Entry<Book, Integer> entry : books.entrySet()) {
                if (entry.getKey().equals(book)) {
                    int numbersOfBook = entry.getValue();
                    numbersOfBook--;
                    books.put(entry.getKey(), numbersOfBook);
                }
            }
        }
        System.out.println(reader + " take a " + book);
    }
}
