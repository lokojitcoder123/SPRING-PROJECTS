package com.cfs.BookAPI.entity;

public class Book{
    private Long id;
    private String title;
    private String author;
    private Double price;



    public Book(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String author, Long id, Double price, String title) {
        this.author = author;
        this.id = id;
        this.price = price;
        this.title = title;
    }
}
