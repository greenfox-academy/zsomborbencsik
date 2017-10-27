package com.greenfox.mrfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    Fox mrFox;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("name", mrFox.name);
        model.addAttribute("food", mrFox.food.foodName);
        model.addAttribute("drink", mrFox.drink.drinkName);
        model.addAttribute("tricks", mrFox.listOfTricks.size());
        return "index";
    }

    @RequestMapping("/nutrition")
    public String nutritionStore(Model model) {
        model.addAttribute("nutritionstore", mrFox);
        return "nutrition";
    }

    @PostMapping("/nutritionAdd")
    public String submitNutrition(@ModelAttribute Food food) {
        this.mrFox.setFood(food);
        return "redirect:/";
    }
}
