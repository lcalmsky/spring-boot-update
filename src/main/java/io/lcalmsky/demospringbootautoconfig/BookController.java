package io.lcalmsky.demospringbootautoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public String book() {
        bookService.hello();
        return "hello";
    }


    @Scheduled(fixedDelay = 1000 * 2)
    public void hi() {
        System.out.println("hi " + Thread.currentThread().getName());
    }
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public Book books() {
        bookRepository.findAll().forEach(System.out::println);
        return bookRepository.findByIsbn("123123");
    }
}
