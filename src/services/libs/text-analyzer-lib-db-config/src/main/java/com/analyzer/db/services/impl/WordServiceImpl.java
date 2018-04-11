package com.analyzer.db.services.impl;

import com.analyzer.db.dao.impl.WordDaoImpl;
import com.analyzer.db.models.impl.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("wordService")
@Transactional
public class WordServiceImpl implements com.analyzer.db.services.CommonService<Word> {

    @Autowired
    WordDaoImpl wordDao;

    @Override
    public void addAuthor(Word object) {

    }

    @Override
    public void updateAuthor(Word object) {

    }

    @Override
    public Word getById(Long id) {
        return wordDao.getById(id);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Word> getAll() {
        return null;
    }
}
