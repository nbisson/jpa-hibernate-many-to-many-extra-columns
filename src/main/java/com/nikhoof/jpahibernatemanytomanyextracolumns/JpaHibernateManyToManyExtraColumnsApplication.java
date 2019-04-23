package com.nikhoof.jpahibernatemanytomanyextracolumns;

import com.nikhoof.jpahibernatemanytomanyextracolumns.models.Publisher;
import com.nikhoof.jpahibernatemanytomanyextracolumns.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateManyToManyExtraColumnsApplication implements CommandLineRunner {

    //private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateManyToManyExtraColumnsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run");

        Publisher publisher = new Publisher();
        publisher.setName("test");

        //publisherRepository.save(publisher);
    }

}
