package com.bookclub.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController
{
    @RequestMapping(method = RequestMethod.GET)
    public String showHome(Model model)
    {
        return "index";
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
