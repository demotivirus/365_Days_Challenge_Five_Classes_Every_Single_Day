package com.demotivirus.Day_011.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestJdbcTransaction {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Student student = new Student("Jhon", "Doe", "jhonDoe@gmail.com");
        Student student2 = new Student("Anna", "Lee", "annaLee@gmail.com");
        Student student3 = new Student("Mark", "Twain", "markTwain@gmail.com");

        session.beginTransaction();

        session.save(student);
        session.save(student2);
        session.save(student3);

        System.out.println();

        session.getTransaction().commit();

        sessionFactory.close();
    }
}
