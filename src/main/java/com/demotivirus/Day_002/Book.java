package com.demotivirus.Day_002;

public class Book {
    private String title;
    private String text;
    private Author author;

    public Book(Author author, String title, String text) {
        this.title = title;
        this.text = text;
        this.author = author;
    }

    public Book(Author author, String title) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", author=" + author.getName() +
                '}';
    }
}
