package com.bookclub.model;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotEmpty;

public class BookOfTheMonth {

    @Id
    private String id;

    private Integer month;

    @NotEmpty(message = "ISBN is a required field")
    private String isbn;

    public BookOfTheMonth() {}

    public BookOfTheMonth(int month, String isbn) {
        this.month = month;
        this.isbn = isbn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getMonth() {
        return month;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("BookOfTheMonth{id=%s, month=%s, isbn=%s}", id, month, isbn);
    }
}
