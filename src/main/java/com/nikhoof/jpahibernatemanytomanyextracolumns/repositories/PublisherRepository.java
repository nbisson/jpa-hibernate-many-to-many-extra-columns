package com.nikhoof.jpahibernatemanytomanyextracolumns.repositories;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
