package com.example.setelkol.Presenter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.setelkol.Model.QuranContract;
import com.example.setelkol.Model.SouraItem;
import com.example.setelkol.SouraContent;
import com.example.setelkol.SouraContentAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SouraContentPresenter implements QuranContract.IQuranPresenter {

    String fileName;
    Context context;
    SouraContentAdapter adapter;
    public SouraContentPresenter(String filename){
        fileName=filename;
        Log.e("SouraContentPresenter",fileName+"");
    }
    @Override
    public void getSoura(RecyclerView recyclerView, Context context) {
        this.context=context;
        Log.e("SouraContentPresenter",fileName+"    2");

        adapter=new SouraContentAdapter(getSoura());
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        recyclerView.setAdapter(adapter);


    }

    private ArrayList<SouraItem> getSoura(){
        ArrayList<SouraItem>listOfAya=new ArrayList<>();

        BufferedReader reader=null;

        try {

            reader=new BufferedReader(new InputStreamReader(context.getAssets().open(fileName)));

            String mLine;
            for(int index=1;(mLine = reader.readLine()) != null;index++){
                listOfAya.add(new SouraItem(mLine,index));
                Log.e("ssssssss",mLine+"");
            }



        } catch (IOException e) {
            e.printStackTrace();
            Log.e("SouraContentPresenter","catch");

        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                    Log.e("SouraContentPresenter",e+"");

                }
            }
        }

        return listOfAya ;
    }
}
