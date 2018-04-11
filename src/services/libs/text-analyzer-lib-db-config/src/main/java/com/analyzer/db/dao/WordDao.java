package com.analyzer.db.dao;

import com.analyzer.db.models.impl.Word;

import java.util.List;

public interface WordDao {

     void addWord(Word objectModel);
     void updateWord(Word word);
    Word getWordById(Long id);
    List getAllWords();


}
