package com.demotivirus.Day_002;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> books = new ArrayList<>();
    private int numsOfBooks;

    public Shelf(Book book) {
        this.books.add(book);
        this.numsOfBooks++;
    }

    public void setBook(Book book) {
        this.books.add(book);
        this.numsOfBooks++;
    }

    public int getNumsOfBooks() {
        return numsOfBooks;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void deleteBook(Book book){
        this.books.remove(book);
        numsOfBooks--;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "book=" + books +
                ", numsOfBooks=" + numsOfBooks +
                '}';
    }
}
