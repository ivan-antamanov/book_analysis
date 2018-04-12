package com.analyzer.db.services.impl;

import com.analyzer.db.dao.impl.WordDaoImpl;
import com.analyzer.db.models.impl.Word;
import com.analyzer.db.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("wordService")
@Transactional
public class WordServiceImpl implements WordService {

    @Autowired
    WordDaoImpl wordDao;

    @Override
    public void add(Word word) {
        wordDao.add(word);
    }

    @Override
    public void update(Word word) {
        wordDao.update(word);
    }

    @Override
    public Word getById(Long id) {
        return wordDao.getById(id);
    }

    @Override
    public void remove(Long id) {
        wordDao.remove(id);
    }

    @Override
    public List<Word> getAll() {
        return wordDao.getAll(Word.class);
    }
}
