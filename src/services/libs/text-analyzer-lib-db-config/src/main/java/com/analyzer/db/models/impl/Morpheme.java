package com.analyzer.db.models.impl;

import com.analyzer.db.models.CommonModel;

import javax.persistence.*;

@Table(name = "morpheme")
@Entity
public class Morpheme extends CommonModel {

    @ManyToOne
    @JoinColumn(name = "rootId")
    private Root root;

    @OneToOne(mappedBy = "morpheme")
    private Word word;

    @Column(name = "prefix")
    private String prefix;

    @Column(name = "suffix")
    private String suffix;

    @Column(name = "postfix")
    private String postfix;

    public Morpheme() {
    }

    public Morpheme(Root root, String prefix, String suffix, String postfix) {
        this.root = root;
        this.prefix = prefix;
        this.suffix = suffix;
        this.postfix = postfix;
    }

    public Root getRoots() {
        return root;
    }

    public void setRoots(Root roots) {
        this.root = roots;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }
}
