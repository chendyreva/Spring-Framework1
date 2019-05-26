package com.geekbrains.controllers;

import com.geekbrains.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {


    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/hello")
    public String test() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "index";
    }


    @Secured({"ROLE_ADMIN"})
    @RequestMapping("/onlyYou")
    @ResponseBody
    public String onlyYou() {
        return "index";
    }

    @Secured({"ROLE_MANAGER"})
    @RequestMapping("/onlyM")
    @ResponseBody
    public String onlyM() {
        return "index";
    }
}
