package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;

@Table(name = "word")
@Entity
public class Word extends CommonModel {

    @Column(name = "word")
    private String word;

    @Column(name = "descriptionId")
    private Long description;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Morpheme morpheme;

    @ManyToOne
    @JoinColumn(name = "rootId")
    private Root root;

    public Word() {
    }

    public Word(String word, Long description, Morpheme morpheme, Root root) {
        this.word = word;
        this.description = description;
        this.morpheme = morpheme;
        this.root = root;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String name) {
        this.word = name;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

    public Morpheme getMorpheme() {
        return morpheme;
    }

    public void setMorpheme(Morpheme morpheme) {
        this.morpheme = morpheme;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }
}
