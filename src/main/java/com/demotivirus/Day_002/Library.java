package com.demotivirus.Day_002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//NOT WORK CORRECTLY...
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Integer> numOfBooks = new ArrayList<>();
    private int numOfLibrariBooks;

    public Library(){}

    public Library(Book book) {
        this.books.add(book);
        this.numOfBooks.add(numOfLibrariBooks++);
        //numOfLibrariBooks++;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBook(Book book) {
        this.books.add(book);
        numOfLibrariBooks++;
        this.numOfBooks.add(numOfLibrariBooks);
        //numOfLibrariBooks++;
    }

    public void setBook(Book book, int numOfBooks){
        if (!this.books.contains(book)) {
            this.books.add(book);
        }
        this.numOfBooks.add(numOfBooks);
    }

    public int getNumOfLibrariBooks() {
        return numOfLibrariBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", numOfBooks=" + numOfBooks +
                ", numOfLibrariBooks=" + numOfLibrariBooks +
                '}';
    }
}
