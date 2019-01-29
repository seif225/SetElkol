package com.example.setelkol.Model;

import android.util.Log;

import java.util.ArrayList;

public class FoodHolderModel implements FoodContract.IFoodModel {

    private static ArrayList<FoodModel> foodItems = new ArrayList<>();

    private void getFoodItems() {
        if(foodItems.size()==0) {
            foodItems.add(new FoodModel("فتة"));
            foodItems.add(new FoodModel("كشري"));
            foodItems.add(new FoodModel("محشي"));
            foodItems.add(new FoodModel("شاورما"));
            foodItems.add(new FoodModel("عدس"));
            foodItems.add(new FoodModel("ملوخية"));
            foodItems.add(new FoodModel("سجق"));
            foodItems.add(new FoodModel("كيدة"));
            foodItems.add(new FoodModel("بيتزا"));
            foodItems.add(new FoodModel("ممبار"));
            foodItems.add(new FoodModel("كفتة"));
            foodItems.add(new FoodModel("مكرونة بشاميل"));
            foodItems.add(new FoodModel("رقاق"));
            foodItems.add(new FoodModel("سمك"));
            foodItems.add(new FoodModel("فراخ"));
            foodItems.add(new FoodModel("مسقعة"));
            foodItems.add(new FoodModel("حواوشي"));
            foodItems.add(new FoodModel("طواجن"));
            foodItems.add(new FoodModel("مكرونة بصلصة"));
            foodItems.add(new FoodModel("فراخ بانيه"));
        }

    }

    @Override
    public ArrayList<FoodModel> getListOfFood() {

        getFoodItems();
        return foodItems;
    }

    @Override
    public void addNewFood(FoodModel foodModel) {
        foodItems.add(foodModel);
    }
}
