package com.demotivirus.Day_011.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInstructor {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        Instructor instructor = new Instructor("Mike", "Tyson", "mikeTyson@gmail.com");
        Instructor instructor1 = new Instructor("Mikle", "Jackson", "superstar@gmail.com");

        InstructorDetail instructorDetail = new InstructorDetail("youtube/miketyson", "boxing");
        InstructorDetail instructorDetail1 = new InstructorDetail("youtube/mikleJackson", "Superstar");

        instructor.setInstructorDetail(instructorDetail);
        instructor1.setInstructorDetail(instructorDetail1);

        session.beginTransaction();
        session.save(instructor);
        session.save(instructor1);
        System.err.println("SAVE INSTRUCTOR: " + instructor);
        System.err.println("SAVE INSTRUCTOR: " + instructor1);
        session.getTransaction().commit();

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Instructor deletingInstructor = session.get(Instructor.class, 1);
        if (deletingInstructor != null){
            session.delete(deletingInstructor);
            System.err.println("DELETE INSTRUCTOR WITH ASSOCIATED TABLES: " + deletingInstructor);
        }
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
