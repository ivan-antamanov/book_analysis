package com.analyzer.db.dao.impl;

import com.analyzer.db.dao.AbstractDao;
import com.analyzer.db.dao.BookDao;
import com.analyzer.db.models.impl.Book;

import java.util.List;

public class BookDaoImpl extends AbstractDao<Book> implements BookDao {

    @Override
    public void addBook(Book book) {
        super.add(book);
    }

    @Override
    public void updateBook(Book book) {
        super.update(book);
    }

    @Override
    public Book getBook(Long id) {
        return super.getById(id);
    }

    @Override
    public void removeBook(Long id) {
        super.remove(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return getAll(Book.class);
    }
}
