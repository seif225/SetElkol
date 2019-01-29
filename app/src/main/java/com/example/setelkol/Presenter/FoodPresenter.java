package com.example.setelkol.Presenter;

import android.graphics.ColorSpace;

import com.example.setelkol.Model.FoodContract;
import com.example.setelkol.Model.FoodHolderModel;
import com.example.setelkol.Model.FoodModel;

import java.util.ArrayList;

public class FoodPresenter implements FoodContract.IFoodPresenter {


    FoodHolderModel foodHolderModel;
    FoodContract.IFoodView iFoodView;
    ArrayList<FoodModel> arrayList;

    public FoodPresenter(FoodContract.IFoodView iFoodView){
        this.iFoodView=iFoodView;
        foodHolderModel=new FoodHolderModel();
    }

    public FoodPresenter(){
        foodHolderModel=new FoodHolderModel();
    }

    @Override
    public void onButtonRandomSug() {
        arrayList=foodHolderModel.getListOfFood();

        //Random num
        int range = (arrayList.size() - 0) ;
        int ans=(int)(Math.random() * range);
        iFoodView.displayTheFood(arrayList.get(ans));

    }

    @Override
    public void onButtonMakeSug(FoodModel foodModel) {
            foodHolderModel.addNewFood(foodModel);
    }


}
