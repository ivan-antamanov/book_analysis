package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;
import java.util.Set;

@Table(name = "topic")
@Entity
public class Topic extends CommonModel {

//    @Id
//    @Column( name = "id")
//    @GeneratedValue
//    private Long id;


    public Topic() {
    }

    public Topic(String name, Set<BookSense> senses) {
        this.name = name;
        this.senses = senses;
    }

    @Column(name ="topicName")
    private String name;

    @ManyToMany(targetEntity = BookSense.class, cascade = {CascadeType.REFRESH})
    @JoinTable(name = "sense topic",
            joinColumns = {@JoinColumn(name = "topicId")}, inverseJoinColumns = {@JoinColumn(name = "senseId")})
    private Set<BookSense> senses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookSense> getSenses() {
        return senses;
    }

    public void setSenses(Set<BookSense> senses) {
        this.senses = senses;
    }
}
