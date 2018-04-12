package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "book")
@Entity
public class Book extends CommonModel {

    public Book() {
    }

    public Book(Long authorId, String genre, String path, String name, Date writtenDate, Long chapters, Long sentences, Long words, Long senseId, Author author) {
        this.genre = genre;
        this.path = path;
        this.name = name;
        this.writtenDate = writtenDate;
        this.chapters = chapters;
        this.sentences = sentences;
        this.words = words;
//        this.senseId = senseId;
        this.author = author;
    }

//    @Id
//    @Column(name = "id")
//    @GeneratedValue()
//    Long id;

    @Column(name = "genre")
    String genre;

    @Column(name = "path")
    String path;

    @Column(name = "name")
    String name;

    @Column(name ="writtenDate")
    Date writtenDate;

    @Column(name = "chapters")
    Long chapters;

    @Column(name = "sentences")
    Long sentences;

    @Column(name = "words")
    Long words;

//    @Column(name = "senseId")
//    Long senseId;

    @OneToOne
    @PrimaryKeyJoinColumn
    private BookSense bookSense;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

//    public Long getAuthorId() {
//        return authorId;
//    }
//
//    public void setAuthorId(Long authorId) {
//        this.authorId = authorId;
//    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Date writtenDate) {
        this.writtenDate = writtenDate;
    }

    public Long getChapters() {
        return chapters;
    }

    public void setChapters(Long chapters) {
        this.chapters = chapters;
    }

    public Long getSentences() {
        return sentences;
    }

    public void setSentences(Long sentences) {
        this.sentences = sentences;
    }

    public Long getWords() {
        return words;
    }

    public void setWords(Long words) {
        this.words = words;
    }

//    public Long getSenseId() {
//        return senseId;
//    }
//
//    public void setSenseId(Long senseId) {
//        this.senseId = senseId;
//    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

   }
