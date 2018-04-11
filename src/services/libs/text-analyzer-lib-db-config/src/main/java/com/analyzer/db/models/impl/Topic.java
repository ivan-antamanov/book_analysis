package com.analyzer.db.models.impl;

import javax.persistence.*;
import java.util.Set;

@Table(name = "topic")
@Entity
public class Topic {

    @Id
    @Column( name = "id")
    @GeneratedValue
    private Long id;

    @Column(name ="topicName")
    private String name;

    @ManyToMany(targetEntity = BookSense.class, cascade = {CascadeType.REFRESH})
    @JoinTable(name = "sense topic",
            joinColumns = {@JoinColumn(name = "topicId")}, inverseJoinColumns = {@JoinColumn(name = "senseId")})
    private Set<BookSense> senses;
}
