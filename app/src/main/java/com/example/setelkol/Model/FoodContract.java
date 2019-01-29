package com.example.setelkol.Model;

import java.util.ArrayList;

public class FoodContract {

    //f return to Food
    public interface IFoodModel{
        public ArrayList<FoodModel> getListOfFood();
        public void addNewFood(FoodModel foodModel);

    }

    public interface IFoodPresenter{
        public void onButtonRandomSug();
        public void onButtonMakeSug(FoodModel foodModel);

    }

    public interface IFoodView{
        // if u want to display food name an
       public void displayTheFood(FoodModel foodModel);

    }
}
