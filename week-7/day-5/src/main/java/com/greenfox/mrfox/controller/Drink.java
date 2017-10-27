package com.greenfox.mrfox.controller;

public class Drink {
    String drinkName;

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public Drink() {
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
