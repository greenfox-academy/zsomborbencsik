package com.greenfox.mysql.controller;

import com.greenfox.mysql.Assignee;
import com.greenfox.mysql.Services.ToDoService;
import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.AssigneeRepository;
import com.greenfox.mysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @Autowired
    ToDoRepository repo;

    @Autowired
    AssigneeRepository assigneeRepository;

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
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("editedToDo", repo.findOne(id));
        model.addAttribute("listAssigneeRepo", assigneeRepository.findAll());
        return "edit";
    }
    @GetMapping("/assignees")
    public String listAssignees(Model model) {
        model.addAttribute("listAssignees",assigneeRepository.findAll());
        return "assignees";
    }
    @PostMapping("/updateAssignees")
    public String updateAssignees(@ModelAttribute Assignee assignee){
        assigneeRepository.save(assignee);
        return "redirect:/todo/assignees/";
    }
    @RequestMapping("/assignees/add")
    public String addAssignee(Model model) {
        model.addAttribute("emptyAssignee", new Assignee());
        return "addAssignees";
    }

}
