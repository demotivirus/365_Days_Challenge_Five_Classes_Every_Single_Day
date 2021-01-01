package com.demotivirus.Day_011.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestJdbcCRUD {
    private static SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    private static Session session = sessionFactory.getCurrentSession();
    private static Student student = new Student("Crud", "Student", "testemail@gmail.com");;

    public static void main(String[] args) {
        create();
        read();
        update();
        delete();

        sessionFactory.close();
    }

    private static void create(){
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        System.err.println("STUDENT CREATE: " + student);
    }

    private static void read(){
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("FROM Student").list();
        for (Student student : students){
            System.err.println(student);
        }
        //session.getTransaction().commit();
    }

    private static void update(){
        Student student = session.get(Student.class, 1);
        student.setFirst_name("Update");
        session.getTransaction().commit();
        System.err.println("STUDENT UPDATE: " + student);
    }

    private static void delete(){
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        List<Student> students = session.createQuery("FROM Student where first_name='Crud'").list();
        for (Student student : students)
            System.err.println("THIS STUDENTS WOS DELETE: " + student);

        session.createQuery(
                "delete FROM Student " +
                        "where first_name='Crud'")
                .executeUpdate();
        session.getTransaction().commit();
        System.err.println("DELETE SUCCESSFUL");
    }
}
