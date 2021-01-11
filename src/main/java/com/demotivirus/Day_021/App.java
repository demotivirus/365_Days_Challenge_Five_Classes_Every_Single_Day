package com.demotivirus.Day_021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude =
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
