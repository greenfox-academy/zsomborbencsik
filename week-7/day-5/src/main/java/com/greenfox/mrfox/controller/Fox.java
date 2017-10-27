package com.greenfox.mrfox.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    ArrayList<Trick> listOfTricks;
    Food food;
    Drink drink;
    boolean isAlive;

    public Fox() {
    }

    public Fox(String name, ArrayList<Trick> listOfTricks, Food food, Drink drink, boolean isAlive) {
        this.name = name;
        this.listOfTricks = listOfTricks;
        this.food = food;
        this.drink = drink;
        this.isAlive = isAlive;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public List<Trick> getListOfTricks() {
        return listOfTricks;
    }

    public Food getFood() {
        return food;
    }

    public Drink getDrink() {
        return drink;
    }
    public void setFoodName(String foodName) {
        this.food.foodName = foodName;
    }

    public boolean getisAlive() {
        return isAlive;
    }
}
