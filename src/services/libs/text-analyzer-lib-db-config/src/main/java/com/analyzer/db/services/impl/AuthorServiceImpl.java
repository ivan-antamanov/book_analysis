package com.analyzer.db.services.impl;

import com.analyzer.db.dao.AuthorDao;
import com.analyzer.db.models.impl.Author;
import com.analyzer.db.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorDao authorDao;

    @Override
    public void add(Author object) {

    }

    @Override
    public void update(Author object) {

    }

    @Override
    public Author getById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Author> getAll() {
        return null;
    }
}
