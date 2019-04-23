package com.nikhoof.jpahibernatemanytomanyextracolumns.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.nikhoof.jpahibernatemanytomanyextracolumns.views.Views;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Data
public class BookPublisher {

    //@JsonIgnore
    @EmbeddedId
    private BookPublisherKey id;

    @ManyToOne
    @MapsId("book_id")
    @JoinColumn(name = "book_id")
    @JsonView(Views.Publisher.class)
    private Book book;

    @ManyToOne
    @MapsId("publisher_id")
    @JoinColumn(name = "publisher_id")
    @JsonView(Views.Book.class)
    private Publisher publisher;

    @JsonView(Views.Publisher.class)
    private Date date;

    public BookPublisherKey getId() {
        return id;
    }

    public void setId(BookPublisherKey id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
