package com.nikhoof.jpahibernatemanytomanyextracolumns.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.nikhoof.jpahibernatemanytomanyextracolumns.views.Views;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
//@Data
public class Publisher {

    @Id
    @JsonView(Views.Book.class)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private long id;

    @JsonView(Views.Publisher.class)
    @Column(name = "name")
    private String name;

    /*@JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "publisherList")
    List<Book> bookList = new ArrayList<Book>();*/

    @JsonView(Views.Publisher.class)
    @OneToMany(mappedBy = "publisher", fetch = FetchType.EAGER)
    Set<BookPublisher> bookPublishers;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookPublisher> getBookPublishers() {
        return bookPublishers;
    }

    public void setBookPublishers(Set<BookPublisher> bookPublishers) {
        this.bookPublishers = bookPublishers;
    }
}
