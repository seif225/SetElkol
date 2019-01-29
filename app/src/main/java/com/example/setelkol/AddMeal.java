package com.example.setelkol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddMeal extends AppCompatActivity {
EditText addMeal;
Button enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);
        addMeal=findViewById(R.id.add_meal_et);
        enter=findViewById(R.id.enter);
    }
}
