package com.demotivirus.Day_002_S2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Author tolkien = new Author("Tolkien");
        Author roaling = new Author("Roaling");
        Book harry1 = new Book(roaling,"Harry Potter 1");
        Book lordOfTheRings = new Book(tolkien,"Lord of the Rings");

        library.setBook(harry1, 8);
        library.setBook(harry1, 8);
        library.putBook(lordOfTheRings, 19);
        library.putBook(lordOfTheRings, 15);
        library.printAllBooks();

        Reader mikael = new Reader("Mikael");
        library.takeBook(mikael, "Lord of the Rings");
        library.takeBook(mikael, harry1);
        library.printAllBooks();

        library.putBook(lordOfTheRings, 7);
        library.printAllBooks();
    }
}
