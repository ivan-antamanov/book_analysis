package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;

@Table(name = "Description")
public class Description extends CommonModel {

//    @Id
//    @Column( name = "id")
//    @GeneratedValue
//    private Long id;

    @Column(name = "part of speech")
    private String partOfSpeech;

    @Column(name = "Description")
    private String description;

    @Column(name = "sphere")
    private String sphere;

    public Description() {
    }

    public Description(String partOfSpeech, String description) {
        this.partOfSpeech = partOfSpeech;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }
}
