package com.demotivirus.Day_023.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class LibraryDaoImpl implements LibraryDao{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    EntityManager em;

    @PostConstruct
    public void init() {
        em=entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(Library library) {
        em.persist(library);
    }
}
