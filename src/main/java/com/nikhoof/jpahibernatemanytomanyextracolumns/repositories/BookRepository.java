package com.nikhoof.jpahibernatemanytomanyextracolumns.repositories;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
