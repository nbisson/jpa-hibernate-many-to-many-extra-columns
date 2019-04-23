package com.nikhoof.jpahibernatemanytomanyextracolumns;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Book;
import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Publisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements Entity<Book> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void save(Book entity) {
        bookRepository.save(entity);
    }
}
