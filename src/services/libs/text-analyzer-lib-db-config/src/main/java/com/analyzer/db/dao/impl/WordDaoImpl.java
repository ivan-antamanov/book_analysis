package com.analyzer.db.dao.impl;


import com.analyzer.db.dao.AbstractDao;
import com.analyzer.db.dao.WordDao;
import com.analyzer.db.models.impl.Word;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("wordDao")
public class WordDaoImpl extends AbstractDao<Word> implements WordDao {

    @Override
    public void addWord(Word objectModel) {
        super.add(objectModel);
    }

    @Override
    public void updateWord(Word word) {

    }

    @Override
    public Word getWordById(Long id) {
        return super.getById(id);
    }

    @Override
    public List<Word> getAllWords() {
        return super.getAll(Word.class);
    }
}
