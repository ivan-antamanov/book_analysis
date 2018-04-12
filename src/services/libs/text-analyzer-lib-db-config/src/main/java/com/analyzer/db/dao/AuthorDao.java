package com.analyzer.db.dao;

import com.analyzer.db.models.impl.Author;

import java.util.List;

public interface AuthorDao {

    void addAuthor(Author author);
    void updateAuthor(Author author);
    Author getAuthor(Long id);
    void removeAuthor(Long id);
    List<Author> getAllAuthors();
}
