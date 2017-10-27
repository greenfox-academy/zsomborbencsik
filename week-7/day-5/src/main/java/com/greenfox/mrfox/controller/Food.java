package com.greenfox.mrfox.controller;

public class Food {
    String foodName;

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public Food() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
