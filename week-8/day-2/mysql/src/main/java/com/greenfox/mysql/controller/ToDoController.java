package com.greenfox.mysql.controller;

import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoRepository repo;

    @RequestMapping({"/","/list"})
    public String list(Model model) {
        model.addAttribute("list",repo.findAll());
        return "todo";
    }
}
