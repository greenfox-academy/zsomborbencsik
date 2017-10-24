package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong count;

    public HelloRESTController() {
        this.count = new AtomicLong(0);
    }

    @RequestMapping
    public Greeting greeting(@RequestParam("name") String name) {
        this.count.getAndIncrement();
        return new Greeting(count.intValue(),"Hello " + name);
    }
}
