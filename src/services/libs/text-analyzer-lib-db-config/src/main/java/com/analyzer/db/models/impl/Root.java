package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;
import java.util.List;

@Table(name = "root")
@Entity
public class Root extends CommonModel {

    @Column(name = "root")
    private String root;

    @OneToMany(mappedBy = "root")
    private List<Morpheme> morpheme;

    @OneToMany(mappedBy = "word")
    private List<Word> words;

    public Root() {
    }

    public Root(List<Morpheme> morphemes, List<Word> words) {
        this.morpheme = morphemes;
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<Morpheme> getMorphemes() {
        return morpheme;
    }

    public void setMorphemes(List<Morpheme> morphemes) {
        this.morpheme = morphemes;
    }
}
