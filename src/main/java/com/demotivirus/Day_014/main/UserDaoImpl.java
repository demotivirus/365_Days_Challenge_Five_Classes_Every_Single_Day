package com.demotivirus.Day_014.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("FROM User ORDER BY login", User.class);
        return query.getResultList();
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }
}
