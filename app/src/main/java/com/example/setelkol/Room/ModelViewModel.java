package com.example.setelkol.Room;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.List;

public class ModelViewModel extends ViewModel {
    private final String TAG = this.getClass().getName();

    private LiveData<List<Item>> listItems;

    public LiveData<List<Item>> getListItems() {
        if (listItems == null){
            Log.e(TAG, "_ListItemsIsNULL");
            listItems = new MutableLiveData<List<Item>>();
            loadItemsFromRepository();
        }
        Log.e(TAG, "_ReturningFromViewModel");
        return listItems;
    }

    private void loadItemsFromRepository() {
        Log.e(TAG, "_LoadFromDB");
        listItems = RepoImp.getInstance().getItems();
    }
}
