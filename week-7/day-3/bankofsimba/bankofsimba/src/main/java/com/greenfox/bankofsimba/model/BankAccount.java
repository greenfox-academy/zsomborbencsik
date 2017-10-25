package com.greenfox.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
    String name;
    double balance;
    String animalType;
    String currency;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = " Frog";
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(this.balance) + this.currency;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }
}
