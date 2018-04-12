package com.analyzer.db.dao;

import com.analyzer.db.models.impl.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);
    void updateBook(Book book);
    Book getBook(Long id);
    void removeBook(Long id);
    List<Book> getAllBooks();
}
