package com.analyzer.db.models.impl;

import javax.persistence.*;

@Table(name = "hero")
@Entity
public class Hero {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "characteristics")
    private String characteristics;

    @ManyToOne
    @JoinColumn(name = "bookSenseId")
    private BookSense sense;

    public Hero() {
    }

    public Hero(String name, String nickname, String characteristics, BookSense sense) {
        this.name = name;
        this.nickname = nickname;
        this.characteristics = characteristics;
        this.sense = sense;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public BookSense getSense() {
        return sense;
    }

    public void setSense(BookSense sense) {
        this.sense = sense;
    }
}

