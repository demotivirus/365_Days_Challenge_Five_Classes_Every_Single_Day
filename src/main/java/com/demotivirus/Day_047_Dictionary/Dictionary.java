package com.demotivirus.Day_047_Dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Dictionary {
    public static void main(String[] args) {
        SpringApplication.run(Dictionary.class);
    }
}
