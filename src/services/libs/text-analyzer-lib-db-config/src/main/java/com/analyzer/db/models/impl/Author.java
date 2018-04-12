package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author extends CommonModel {

    public Author() {
    }

    public Author(String name, String surname, String patronymic, String bornPlace, Date bornDate, String deathPlace, Date deathDate, String writingStyle, String characteristic, String literaryMovement, Set<Book> books) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.bornPlace = bornPlace;
        this.bornDate = bornDate;
        this.deathPlace = deathPlace;
        this.deathDate = deathDate;
        this.writingStyle = writingStyle;
        this.characteristic = characteristic;
        this.literaryMovement = literaryMovement;
        this.books = books;
    }


    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "patronymic") //отчество
            String patronymic;

    @Column(name = "born place")
    String bornPlace;

    @Column(name = "born date")
    Date bornDate;

    @Column(name = "death place")
    String deathPlace;

    @Column(name = "death date")
    Date deathDate;

    @Column(name = "writing style")
    String writingStyle;

    @Column(name = "characteristic")
    String characteristic;

    @Column(name = "literary movement")
    String literaryMovement;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlace(String deathPlace) {
        this.deathPlace = deathPlace;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public String getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(String writingStyle) {
        this.writingStyle = writingStyle;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getLiteraryMovement() {
        return literaryMovement;
    }

    public void setLiteraryMovement(String literaryMovement) {
        this.literaryMovement = literaryMovement;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (!books.isEmpty()) {
            books.add(book);
        } else {
            books = new HashSet<Book>();
            books.add(book);
        }
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
