package com.example.setelkol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.setelkol.Presenter.SouraContentPresenter;

public class SouraContent extends AppCompatActivity {

    String filename;
    SouraContentPresenter souraContentPresenter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soura_content);

        Intent intent=getIntent();
        filename=intent.getStringExtra("fileName");
        Log.e("SouraContent","done here");
        recyclerView=findViewById(R.id.souraContentContainer);
        souraContentPresenter=new SouraContentPresenter(filename);
        souraContentPresenter.getSoura(recyclerView,getApplicationContext());
        Log.e("SouraContent","done here2");

    }
}
