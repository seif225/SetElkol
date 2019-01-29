package com.example.setelkol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.setelkol.Room.Item;
import com.example.setelkol.Room.RepoImp;

public class AddMeal extends AppCompatActivity {

    EditText addMeal;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);

        addMeal=findViewById(R.id.add_meal_et);
        enter=findViewById(R.id.enter);



        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RepoImp.getInstance().addItem(new Item(addMeal.getText().toString()));
                // show toast
                Toast.makeText(AddMeal.this,"Record Added", Toast.LENGTH_SHORT).show();
                // get back to main activity
                finish();

            }
        });
    }
}
