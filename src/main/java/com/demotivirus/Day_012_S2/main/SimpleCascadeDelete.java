package com.demotivirus.Day_012_S2.main;

import com.demotivirus.Day_011.main.Instructor;
import com.demotivirus.Day_011.main.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SimpleCascadeDelete {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        create(session);
        delete(session, sessionFactory);
    }

    private static void create(Session session) {
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
    }

    private static void delete(Session session, SessionFactory sessionFactory){
        //session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        InstructorDetail instructorDetail = session.get(InstructorDetail.class, 7);
        instructorDetail.getInstructor().setInstructorDetail(null);
        if (instructorDetail != null){
            session.delete(instructorDetail);
            System.err.println("DELETE INSTRUCTOR DETAIL: " + instructorDetail);
            //System.err.println("DELETE INSTRUCTOR: " + instructorDetail.getInstructor());
            session.getTransaction().commit();
        }
    }
}
