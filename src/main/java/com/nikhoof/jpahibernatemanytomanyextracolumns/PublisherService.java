package com.nikhoof.jpahibernatemanytomanyextracolumns;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Publisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService implements Entity<Publisher> {

    @Autowired
    PublisherRepository publisherRepository;

    @Override
    public void save(Publisher entity) {
        publisherRepository.save(entity);
    }

    public List<Publisher> findAll() { return publisherRepository.findAll(); }
}
