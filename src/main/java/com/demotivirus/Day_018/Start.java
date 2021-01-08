package com.demotivirus.Day_018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class);
    }
}
