package com.analyzer.db.dao.impl;

import com.analyzer.db.dao.AbstractDao;
import com.analyzer.db.dao.AuthorDao;
import com.analyzer.db.models.impl.Author;

import java.util.List;

public class AuthorDaoImpl extends AbstractDao<Author> implements AuthorDao {

    @Override
    public void addAuthor(Author author) {
        super.add(author);
    }

    @Override
    public void updateAuthor(Author author) {
        super.update(author);
    }

    @Override
    public Author getAuthor(Long id) {
        return super.getById(id);
    }

    @Override
    public void removeAuthor(Long id) {
        super.remove(id);
    }

    @Override
    public List<Author> getAllAuthors() {
        return super.getAll(Author.class);
    }
}
