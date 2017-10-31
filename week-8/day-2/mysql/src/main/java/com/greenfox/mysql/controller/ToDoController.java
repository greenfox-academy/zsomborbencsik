package com.greenfox.mysql.controller;

import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/add")
    public String addToDo(Model model) {
        model.addAttribute("emptyToDo", new Todo());
        return "add";
    }
    @PostMapping("/update")
    public String updateEntry(@ModelAttribute Todo todo){
        repo.save(todo);
        return "redirect:/todo/";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("editedToDo", repo.findOne(id));
        repo.delete(id);
        return "redirect:/todo/";
    }
}
