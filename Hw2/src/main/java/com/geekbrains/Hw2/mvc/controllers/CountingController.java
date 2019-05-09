package com.geekbrains.Hw2.mvc.controllers;

import com.geekbrains.Hw2.spring.domain.Counting;
import com.geekbrains.Hw2.spring.service.CountingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CountingController {

    @Autowired(required = true)
    private CountingService countingService;

    @RequestMapping(method = "/", value = "/")
    public String root() {
        return "countings";
    }

    @RequestMapping(value = "/countings")
    public String allCountings(Model model) {
        model.addAttribute("countings", countingService.getCountings());
        return "countings.jsp";
    }
    @ModelAttribute("counting")
    public Counting newCounting() {
        return new Counting();
    }
    @RequestMapping(value = "/payments", method = RequestMethod.POST)
    public String addCounting(@ModelAttribute("counting") Counting counting) {
        countingService.addCounting(counting);
        return "redirect:countings";
    }
}