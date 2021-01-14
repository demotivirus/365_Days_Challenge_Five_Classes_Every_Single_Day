package com.demotivirus.Day_024;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> findAll() {
        return entityManager.createQuery("from Book", Book.class).getResultList();
    }

    @Override
    public Book findById(Long bookId) {
        return entityManager.find(Book.class, bookId);
    }

    @Override
    //If id == 0 save, else - update
    public void save(Book book) {
        entityManager.merge(book);
    }

    @Override
    public void deleteById(Long bookId) {
        entityManager
                .createQuery("DELETE FROM Book WHERE id = :bookId")
                .setParameter("bookId", bookId)
                .executeUpdate();
    }
}
