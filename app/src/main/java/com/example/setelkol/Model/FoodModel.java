package com.example.setelkol.Model;

public class FoodModel {

    private String foodName;
    private int foodPhoto;

    public FoodModel(String foodName, int foodPhoto) {
        this.foodName = foodName;
        this.foodPhoto = foodPhoto;
    }

    public FoodModel(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodPhoto() {
        return foodPhoto;
    }
}
