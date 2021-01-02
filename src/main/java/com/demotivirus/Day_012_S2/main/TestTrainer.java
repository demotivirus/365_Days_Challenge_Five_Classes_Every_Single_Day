package com.demotivirus.Day_012_S2.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//NOT WORK CORRECTLY - WHERE LazyInitEx ???
public class TestTrainer {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Trainer.class)
                .addAnnotatedClass(TrainerInfo.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        create(session);
        read(session, sessionFactory);
        deleteCourse(session, sessionFactory);

        sessionFactory.close();
    }

    private static void create(Session session) {
        try {
            session.beginTransaction();
            Trainer mikeTyson = new Trainer("Mike", "Tyson", "myketyson@gmail.com");
            TrainerInfo mikeInfo = new TrainerInfo(500, "Fishing");
            Course mikeTysonCourse = new Course("How to cooking your opponent");
            Course mikeTysonCourse2 = new Course("How to boxing your opponent");
            Course mikeTysonCourse3 = new Course("How to...");
            mikeTyson.add(mikeTysonCourse);
            mikeTyson.add(mikeTysonCourse2);
            mikeTyson.add(mikeTysonCourse3);
            mikeTyson.setTrainerInfo(mikeInfo);

            session.save(mikeTyson);
            session.save(mikeTysonCourse);
            session.save(mikeTysonCourse2);
            session.save(mikeTysonCourse3);
            System.err.println("SAVE TRAINER: " + mikeTyson);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void read(Session session, SessionFactory sessionFactory) {
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Trainer trainer = session.get(Trainer.class, 2);
            System.err.println("Trainer: " + trainer);
            System.err.println("Courses: " + trainer.getCourses());
            System.err.println("Trainer info: " + trainer.getTrainerInfo());
            session.getTransaction().commit();

            //WHERE LazyInitEx ???
            session.close();
            System.err.println("Courses: " + trainer.getCourses());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void deleteCourse(Session session, SessionFactory sessionFactory){
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Course course = session.get(Course.class, 1);
            if (course != null){
                session.delete(course);
                System.err.println("DELETE COURSE: " + course);
                session.getTransaction().commit();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
