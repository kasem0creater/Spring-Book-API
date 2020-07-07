package com.oopRest.RestAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String book;
    private String price;


    public Book(){}
    public Book(String book , String price)
    {
        this.book = book;
        this.price = price;
    }
    public Book(Long id,String book , String price)
    {
        this.id = id;
        this.book = book;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setId(long id) {
        this.id = id;
    }
}