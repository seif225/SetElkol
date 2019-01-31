package com.example.setelkol.Model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class QuranContract {

    public interface IQuranModel{
        public String[] getSouraName();
    }

   public  interface IQuranPresenter{
       public void getSoura(RecyclerView recyclerView, Context context);
   }

   public interface IQuranView{}
}
