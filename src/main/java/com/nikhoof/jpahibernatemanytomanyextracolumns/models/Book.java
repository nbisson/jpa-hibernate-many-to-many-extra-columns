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
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(Views.Publisher.class)
    @Column(name = "book_id")
    private long id;

    @Column(name = "name")
    @JsonView(Views.Publisher.class)
    private String name;

    /*@JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "bookPublisher",
    joinColumns = {@JoinColumn(name = "book_id")},
    inverseJoinColumns = {@JoinColumn(name = "publisher_id")})
    List<Publisher> publisherList = new ArrayList<Publisher>();*/

    @JsonIgnore
    @JsonView(Views.Book.class)
    @OneToMany(mappedBy = "book")
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
