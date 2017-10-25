package com.greenfox.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
    String name;
    double balance;
    String animalType;
    String currency;
    boolean isKing;
    boolean good;

    public BankAccount(String name, double balance, String animalType, boolean good) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = " Frog";
        if (this.name.equals("King")) {
            this.isKing = true;
        } else {
            this.isKing = false;
        }
        this.good = good;
    }

    public boolean getGood() {
        return good;
    }

    public boolean getisKing() {
        return isKing;
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
