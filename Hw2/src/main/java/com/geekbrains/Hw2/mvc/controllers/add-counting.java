package com.geekbrains.Hw2.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
class AddCounting {
    @RequestMapping(value = "/add-counting", method = RequestMethod.GET)
    public String AddCounting() {
        return "add-counting.jsp";
    }
}