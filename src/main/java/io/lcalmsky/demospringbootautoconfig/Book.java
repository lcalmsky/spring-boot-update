package io.lcalmsky.demospringbootautoconfig;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Book {

    @Id
    private Integer id;

    private String title, isbn;

    private LocalDate published;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }


    @Override
    public String toString() {
        return String.format(
                "Book (id=%s, isbn=%s, published=%s, title=%s)", this.id, this.isbn, this.published, this.title);
    }
}
