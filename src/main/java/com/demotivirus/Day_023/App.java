package com.demotivirus.Day_023;

import com.demotivirus.Day_023.Book.Book;
import com.demotivirus.Day_023.Library.Library;
import com.demotivirus.Day_023.Library.LibraryDaoImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class App {
    public static void main(String[] args) {
        //SpringApplication.run(App.class);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(App.class);
        LibraryDaoImpl library = (LibraryDaoImpl) context.getBean("libraryDaoImpl");
        //BookDao bookDao = (BookDao) context.getBean("book");
        library.save(new Library(new Book("Horror")));
        System.out.println(library);
    }
}
