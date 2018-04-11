package com.analyzer.db.models.impl;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bookSense")
public class BookSense {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "sense")
    private Set<Hero> heroes;

    @OneToOne(mappedBy = "bookSense")
    private Book book;

    @ManyToMany( targetEntity = Topic.class, cascade = CascadeType.REFRESH)
    @JoinTable(name = "sense topic",
            joinColumns = {@JoinColumn(name = "senseId")}, inverseJoinColumns = {@JoinColumn(name = "topicId")})
    private Set<Topic> topics;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(Set<Hero> heroes) {
        this.heroes = heroes;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }
}
