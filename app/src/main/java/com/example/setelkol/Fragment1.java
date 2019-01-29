package com.example.setelkol;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.setelkol.Model.FoodContract;
import com.example.setelkol.Model.FoodModel;
import com.example.setelkol.Presenter.FoodPresenter;

public class Fragment1 extends Fragment  implements FoodContract.IFoodView {

    View view;
    TextView sugName;
    Button makeSug;
    FoodPresenter presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1,container,false);

       sugName=view.findViewById(R.id.text_sug);
       makeSug=view.findViewById(R.id.button_sug);

       presenter=new FoodPresenter(this);

       makeSug.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               presenter.onButtonRandomSug();
           }
       });
       return view;

    }

    @Override
    public void displayTheFood(FoodModel foodModel) {

        sugName.setText(foodModel.getFoodName()+"");
    }
}
