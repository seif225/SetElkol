package com.example.setelkol;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.setelkol.Model.QuranContract;
import com.example.setelkol.Presenter.SouraNamePresenter;

public class Fragment2 extends Fragment implements QuranContract.IQuranView {

    RecyclerView recyclerView;
    SouraNamePresenter souraNamePresenter;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        recyclerView= view.findViewById(R.id.souraContainer);

        souraNamePresenter=new SouraNamePresenter();
        souraNamePresenter.getSoura(recyclerView,view.getContext());

        return view;
    }


}
