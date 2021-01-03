package com.demotivirus.Day_013.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPost {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Post.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        create(session);
        //readWithLazyEx(session, sessionFactory);
        delete(session, sessionFactory);

        sessionFactory.close();
    }

    private static void create(Session session) {
        try {
            session.beginTransaction();

            Post post = new Post("Sensation!!!", "Many text here...");
            post.addReview(new Review("Omg"));
            post.addReview(new Review("Dast is fantastish!"));
            post.addReview(new Review("Super ;)"));

            session.save(post);
            System.err.println("SAVE POST: " + post);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void readWithLazyEx(Session session, SessionFactory sessionFactory) {
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Post post = session.get(Post.class, 1);
            session.getTransaction().commit();

            //FIX & NOW HERE LAZY EX!!!
            session.close();
            System.err.println("POSTS: " + post.getReviews());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void delete(Session session, SessionFactory sessionFactory){
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Post post = session.get(Post.class, 1);
            if(post != null){
                session.delete(post);
                System.err.println("DELETE POST: " + post);
                session.getTransaction().commit();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
