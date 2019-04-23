package com.nikhoof.jpahibernatemanytomanyextracolumns.repositories;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher, Integer> {
}
