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
        RepoImp.getInstance().addItem(new Item("bom"));


        // set view model
        mViewModel = ViewModelProviders.of(this).get(ModelViewModel.class);
        mViewModel.getListItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(@Nullable List<Item> items) {
                // update DataSet
                list.clear();
                list.addAll(mViewModel.getListItems().getValue());

            }
        });
        makeSug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < list.size(); i++) {
                    sugName.setText(list.get(i).getMeal());
                }
            }
        });
       return view;


    }

}
