package com.example.setelkol.Presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.setelkol.Model.QuranContract;
import com.example.setelkol.Model.QuranDataModel;
import com.example.setelkol.Model.SouraItem;
import com.example.setelkol.Room.Item;
import com.example.setelkol.SouraAdapter;
import com.example.setelkol.SouraContent;

import java.util.ArrayList;

public class SouraNamePresenter implements QuranContract.IQuranPresenter {

    QuranDataModel quranDataModel;
    String [] souraNames;
    ArrayList<SouraItem>list;
    SouraAdapter adapter;
    public SouraNamePresenter() {
        this.quranDataModel =new QuranDataModel();
        list=new ArrayList<>();
    }
    @Override
    public void getSoura(RecyclerView recyclerView, final Context context){
        souraNames=quranDataModel.getSouraName();
        if(list.size()==0){
            for(int i=0;i<souraNames.length;i++){
                list.add(new SouraItem(souraNames[i]));
            }
        }
        adapter=new SouraAdapter(list);
        adapter.setOnItemClickListener(new SouraAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent=new Intent(context, SouraContent.class);
                intent.putExtra("fileName",(position+1)+".txt");
                Log.e("SouraNamePresenter",position+1+"");
                context.startActivity(intent);

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }
}
