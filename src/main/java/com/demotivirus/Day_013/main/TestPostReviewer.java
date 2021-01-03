package com.demotivirus.Day_013.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPostReviewer {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Post.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Reviewer.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        createPost(session);
        createReviewer(session, sessionFactory);
        deletePost(session, sessionFactory);
        deleteReviewer(session, sessionFactory);

        sessionFactory.close();
    }

    private static void createPost(Session session) {
        try {
            session.beginTransaction();

            Post post = new Post("Sensation!", "Armageddon come here!");
            Reviewer reviewer = new Reviewer("Adam", "0sdjfn23", "adam@gmail.com");
            Reviewer reviewer1 = new Reviewer("Eva", "sdkfjej33bb", "eva@gmail.com");

            post.addReviewer(reviewer);
            post.addReviewer(reviewer1);

            session.save(post);
            session.save(reviewer);
            session.save(reviewer1);
            System.err.println("SAVE POST: " + post);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void createReviewer(Session session, SessionFactory sessionFactory) {
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Reviewer reviewer = new Reviewer("TonnyRobbins666", "kokoko", "hackmy@gmail.com");
            Post post = new Post("Sensation!", "Armageddon come here!");
            Post post1 = new Post("This is bullshit", "How to cook in space...");

            reviewer.addPost(post1);
            reviewer.addPost(post);

            session.save(reviewer);
            session.save(post);
            session.save(post1);

            System.err.println("SAVE reviewer: " + reviewer);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void deletePost(Session session, SessionFactory sessionFactory){
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Post post = session.get(Post.class, 1);
            if(post != null){
                session.delete(post);
                System.err.println("DELETE post: " + post);
                session.getTransaction().commit();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void deleteReviewer(Session session, SessionFactory sessionFactory){
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Reviewer reviewer = session.get(Reviewer.class, 3);
            if(reviewer != null){
                session.delete(reviewer);
                System.err.println("DELETE reviewer: " + reviewer);
                session.getTransaction().commit();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
