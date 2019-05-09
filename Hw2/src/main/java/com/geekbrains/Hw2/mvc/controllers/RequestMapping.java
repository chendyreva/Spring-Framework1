package com.geekbrains.Hw2.mvc.controllers;

import org.springframework.web.bind.annotation.RequestMethod;

public @interface RequestMapping {
    RequestMethod method();
    String value();
}
