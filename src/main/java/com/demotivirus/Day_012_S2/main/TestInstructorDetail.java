package com.demotivirus.Day_012_S2.main;

import com.demotivirus.Day_011.main.Instructor;
import com.demotivirus.Day_011.main.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInstructorDetail {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);
        System.err.println("Instructor detail: " + instructorDetail);
        System.err.println("The associated instructor: " + instructorDetail.getInstructor());
        session.getTransaction().commit();

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            //Throw exception
            InstructorDetail instructorDetail2 = session.get(InstructorDetail.class, 1000);
            System.err.println("Instructor detail: " + instructorDetail2);
            System.err.println("The associated instructor: " + instructorDetail2.getInstructor());
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
