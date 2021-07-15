package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class MemBookDao implements BookDao {

    private List<Book> books;

    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("0345339681", "The Hobbit", "Bilbo Baggins was a hobbit who wanted to be left alone in quiet comfort. But the wizard Gandalf came along with a band of homeless dwarves. Soon Bilbo was drawn into their quest, facing evil orcs, savage wolves, giant spiders, and worse unknown dangers. Finally, it was Bilbo–alone and unaided–who had to confront the great dragon Smaug, the terror of an entire countryside", 322, new ArrayList<>(List.of("J.R.R. Tolkien"))));
        this.books.add(new Book("0261103571", "The Fellowship of the Ring", "The first volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them", 432, new ArrayList<>(List.of("J.R.R. Tolkien"))));
        this.books.add(new Book("1514297272", "The Two Towers", "The second volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS", 448, new ArrayList<>(List.of("J.R.R. Tolkien"))));
        this.books.add(new Book("1514298139", "The Return of the King", "The third volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS", 432, new ArrayList<>(List.of("J.R.R. Tolkien"))));
        this.books.add(new Book("9780593099322", "Dune", "A deluxe hardcover edition of Frank Herbert’s epic masterpiece—a triumph of the imagination and one of the bestselling science fiction novels of all time.", 688, new ArrayList<>(List.of("J.R.R. Tolkien"))));
    }

    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}
