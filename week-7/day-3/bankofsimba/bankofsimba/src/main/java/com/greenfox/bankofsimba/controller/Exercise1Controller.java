package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Exercise1Controller {
    BankAccount bankAcc1;


    public Exercise1Controller() {
        this.bankAcc1 = new BankAccount("Simba",2000,"lion",true);
    }

    @RequestMapping("/bankaccount")
    public String listing(Model model) {
        model.addAttribute("bankaccount",bankAcc1);
        return "listing";
    }

    @RequestMapping("/method")
    public String methodName(Model model) {
        String text = "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"";
        model.addAttribute("text", text);
        return "method";
    }

    @RequestMapping("/bankaccount/list")
    public String listAllAccounts(Model model) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Nemo",1,"fish",true));
        bankAccounts.add(new BankAccount("King",10000,"human",false));
        bankAccounts.add(new BankAccount("Doggie",2,"dog",true));
        bankAccounts.add(new BankAccount("Bambi",15,"deer",false));
        model.addAttribute("listOfAccounts",bankAccounts);
        return "listofbankaccounts";
    }

    @GetMapping("/bankaccount/list")
    public ModelAndView incrementBalance() {
        ModelAndView modelAndView = new ModelAndView("incrementBalance");
        modelAndView.addObject("increment", );

    }

}
