package com.nikhoof.jpahibernatemanytomanyextracolumns.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Data
public class BookPublisherKey implements Serializable {

    @Column(name = "book_id")
    long bookId;

    @Column(name = "publisher_id")
    long publisherId;

}
