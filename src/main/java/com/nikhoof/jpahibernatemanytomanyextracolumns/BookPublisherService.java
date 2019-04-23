package com.nikhoof.jpahibernatemanytomanyextracolumns;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.BookPublisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Publisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.repositories.BookPublisherRepository;
import com.nikhoof.jpahibernatemanytomanyextracolumns.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookPublisherService implements Entity<BookPublisher> {

    @Autowired
    BookPublisherRepository bookPublisherRepository;

    @Override
    public void save(BookPublisher entity) {
        bookPublisherRepository.save(entity);
    }
}
