package com.example.setelkol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.setelkol.Model.FoodModel;
import com.example.setelkol.Presenter.FoodPresenter;

public class AddMeal extends AppCompatActivity {

    EditText addMeal;
    Button enter;
    FoodPresenter foodPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);

        addMeal=findViewById(R.id.add_meal_et);
        enter=findViewById(R.id.enter);

        foodPresenter=new FoodPresenter();

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodPresenter.onButtonMakeSug(new FoodModel(addMeal.getText().toString()));
                addMeal.setText("");
            }
        });
    }
}
