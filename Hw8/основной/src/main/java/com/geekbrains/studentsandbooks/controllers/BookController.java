package com.geekbrains.gbrestdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "index";
    }
}
