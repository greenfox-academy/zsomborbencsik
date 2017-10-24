package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong count2;

    public HelloWebController() {
        this.count2 = new AtomicLong(0);
    }

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam(value = "name") String name) {
        count2.getAndIncrement();
        model.addAttribute("name",name);
        model.addAttribute("id",this.count2);
        return "greeting";
    }
}
