package com.demotivirus.Day_018.dao;

import com.demotivirus.Day_018.model.Email;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmailDaoImpl implements EmailDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Email> getAllEmails() {
        return  sessionFactory.getCurrentSession().createQuery("FROM Email", Email.class).getResultList();
    }
}