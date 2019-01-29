package com.example.setelkol;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.setelkol.Room.Item;
import com.example.setelkol.Room.ModelViewModel;
import com.example.setelkol.Room.RepoImp;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {

    View view;
    TextView sugName;
    Button makeSug;

    List<Item> list;
    private ModelViewModel mViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1,container,false);

       sugName=view.findViewById(R.id.text_sug);
       makeSug=view.findViewById(R.id.button_sug);

        list = new ArrayList<>();
        RepoImp.getInstance().addItem(new Item("فتة"));
        RepoImp.getInstance().addItem(new Item("كشري"));
        RepoImp.getInstance().addItem(new Item("محشي"));
        RepoImp.getInstance().addItem(new Item("شاورما"));
        RepoImp.getInstance().addItem(new Item("عدس"));
        RepoImp.getInstance().addItem(new Item("ملوخية"));
        RepoImp.getInstance().addItem(new Item("سجق"));
        RepoImp.getInstance().addItem(new Item("كبدة"));
        RepoImp.getInstance().addItem(new Item("بيتزا"));
        RepoImp.getInstance().addItem(new Item("ممبار"));
        RepoImp.getInstance().addItem(new Item("كفتة"));
        RepoImp.getInstance().addItem(new Item("مكرونة بشاميل"));
        RepoImp.getInstance().addItem(new Item("رقاق"));
        RepoImp.getInstance().addItem(new Item("سمك"));
        RepoImp.getInstance().addItem(new Item("فراخ"));
        RepoImp.getInstance().addItem(new Item("مسقعة"));
        RepoImp.getInstance().addItem(new Item("حواوشي"));
        RepoImp.getInstance().addItem(new Item("طواجن"));
        RepoImp.getInstance().addItem(new Item("مكرونة بصلصة"));
        RepoImp.getInstance().addItem(new Item("فراخ بانيه"));


        // set view model
        mViewModel = ViewModelProviders.of(this).get(ModelViewModel.class);
        mViewModel.getListItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(@Nullable List<Item> items) {
                // update DataSet

                list.addAll(mViewModel.getListItems().getValue());

            }
        });
        makeSug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int range = (list.size() - 0) ;
                int ans=(int)(Math.random() * range);
                sugName.setText(list.get(ans).getMeal());
            }
        });
       return view;


    }

}
