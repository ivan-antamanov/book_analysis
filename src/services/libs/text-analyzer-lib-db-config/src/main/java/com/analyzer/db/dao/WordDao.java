package com.analyzer.db.dao;

import com.analyzer.db.models.impl.Word;

import java.util.List;

public interface WordDao {

    void addWord(Word objectModel);
    void updateWord(Word word);
    Word getWord(Long id);
    void removeWord(Long id);
    List<Word> getAllWords();


}
