package com.demotivirus.Day_021.Book;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public List<Book> getBooks() {
        return entityManager.createQuery("FROM Book").getResultList();
    }

    @Override
    public Book getBook(Integer id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void saveBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public void deleteBook(Integer id) {
        entityManager.remove(getBook(id));
    }
}
