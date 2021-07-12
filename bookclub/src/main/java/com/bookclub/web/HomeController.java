package com.bookclub.web;

import com.bookclub.model.Book;
import com.bookclub.service.impl.MemBookDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController
{
    @RequestMapping(method = RequestMethod.GET)
    public String showHome(Model model)
    {
        MemBookDao bookDao = new MemBookDao();
        List<Book> books = bookDao.list();

        for (Book book : books) {
            System.out.println(book.toString());
        }

        model.addAttribute("books", books);

        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String getMonthlyBook(@PathVariable("id") String id, Model model) {
        String isbn = id;
        System.out.println(id);

        MemBookDao bookDao = new MemBookDao();
        Book book = bookDao.find(isbn);

        System.out.println(book.toString());

        model.addAttribute("book", book);
        return "monthly-books/view";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String showAboutUs(Model model)
    {
        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contact")
    public String showContactUs(Model model)
    {
        return "contact";
    }
}
