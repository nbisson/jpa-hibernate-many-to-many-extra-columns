package com.nikhoof.jpahibernatemanytomanyextracolumns;

import com.fasterxml.jackson.annotation.JsonView;
import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Book;
import com.nikhoof.jpahibernatemanytomanyextracolumns.models.BookPublisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.models.BookPublisherKey;
import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Publisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.views.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class PublisherController {

    @Autowired
    private  BookService bookService;

    @Autowired
    private PublisherService publisherService;

    @Autowired
    private BookPublisherService bookPublisherService;

    @RequestMapping(value = "/publishers", method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody Publisher publisher) {

        Book book1 = new Book();
        book1.setName("Cuistre");

        bookService.save(book1);

        publisherService.save(publisher);

        BookPublisherKey bookPublisherKey = new BookPublisherKey();
        bookPublisherKey.setBookId(book1.getId());
        bookPublisherKey.setPublisherId(publisher.getId());

        BookPublisher bookPublisher = new BookPublisher();
        bookPublisher.setId(bookPublisherKey);
        bookPublisher.setDate(new Date());

        bookPublisherService.save(bookPublisher);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @JsonView(Views.Publisher.class)
    @RequestMapping(value = "/publishers", method = RequestMethod.GET)
    public ResponseEntity<List<Publisher>> get() {
        return new ResponseEntity(publisherService.findAll(), HttpStatus.OK);
    }

}
