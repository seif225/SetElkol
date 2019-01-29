package com.example.setelkol.Room;

import android.arch.lifecycle.LiveData;

import java.util.List;

public interface Repository {

    void addItem(Item item);
    void deleteItem(Item item);
    LiveData<List<Item>> getItems();
}
