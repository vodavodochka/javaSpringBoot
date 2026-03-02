package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Integer likes) {
        this.text = text;
        this.creationDate = new Date();
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }
}
