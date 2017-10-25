package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.text.NumberFormat;

@Controller
public class Exercise1Controller {
    BankAccount bankAcc1;

    public Exercise1Controller() {
        this.bankAcc1 = new BankAccount("Simba",2000,"lion");
    }

    @RequestMapping("/bankaccount")
    public String listing(Model model) {
        model.addAttribute("bankaccount",bankAcc1);
        return "listing";
    }

}
