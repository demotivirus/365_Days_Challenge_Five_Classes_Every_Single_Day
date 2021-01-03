package com.demotivirus.Day_013.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
//NOT WORK: how write JOIN FETCH in postgre?
public class JoinFetch {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Post.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        readWithoutLazy(session);
        sessionFactory.close();
    }

    private static void readWithoutLazy(Session session){
        try {
            session.beginTransaction();

            Query<Post> query = session.createQuery(
                            "SELECT p FROM Post p " +
                                    "JOIN FETCH " +
                                    "WHERE p.id = :postId", Post.class);
            query.setParameter("postId", 2);

            Post post = query.getSingleResult();
            System.err.println(post);

            session.getTransaction().commit();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
