package com.demotivirus.Day_002;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testRouling();
        testTolkien();
        testShelf();
        testLibrary();
    }

    private static void testTolkien(){
        List<Book> tolkienBooks = new ArrayList<>();
        tolkienBooks.add(lordOfTheRings);
        tolkien.setBooks(tolkienBooks);
        System.out.println(tolkien);

        lordOfTheRings.setAuthor(tolkien);
        System.out.println(lordOfTheRings);
        printLine();
    }

    private static void testRouling(){
        System.out.println(harryPotter);

        System.out.println(harry2);

        List<Book> roulingBooks = new ArrayList<>();
        roulingBooks.add(harry2);
        roulingBooks.add(harryPotter);
        rouling.setBooks(roulingBooks);

        System.out.println(rouling);

        roulingBooks.add(harry2);
        System.out.println(rouling);
        printLine();
    }

    private static void testShelf(){
        Shelf shelf = new Shelf(
                harry2
        );
        System.out.println(shelf);
        shelf.setBook(harryPotter);
        System.out.println(shelf);
        System.out.println(shelf.getBooks());

        shelf.deleteBook(harryPotter);
        System.out.println(shelf);
        printLine();
    }

    private static void testLibrary(){
        Library library = new Library();
        System.out.println(library);
        library.setBook(harryPotter);
        System.out.println(library);

        library.setBook(harry2, 5);
        System.out.println(library);
//        library.setBook(harry2, 5);
//        System.out.println(library);
        printLine();
    }

    private static void printLine(){
        System.out.println("==============================");
    }

    private static Author tolkien = new Author("Tolkien");
    private static Book lordOfTheRings = new Book(
            tolkien,
            "Lord of the Rings",
            "In a sleepy village in the Shire, a young hobbit is entrusted with an immense task...");

    private static Author rouling = new Author("Rouling");
    private static Book harryPotter = new Book(
            rouling,
            "Harry potter 1",
            "Harry is a little wizard on Hogwards...");
    private static Book harry2 = new Book(
            rouling,
            "Harry Potter 2"
    );
}
