package io.lcalmsky.demospringbootautoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Async
    public void hello() {
        System.out.println("hello " + Thread.currentThread().getName());
    }

    @PostConstruct
    public void init() {
        Book book = new Book();
        book.setIsbn("123123");
        book.setTitle("spring boot update");
        book.setPublished(LocalDate.now());
        bookRepository.save(book);
    }
}
