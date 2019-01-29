package com.example.setelkol.Room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.util.Log;

import com.example.setelkol.MyApplication;

import java.util.List;

public class RepoImp implements Repository {

    private static RepoImp repository = new RepoImp();
    private ItemDatabase itemDB;
    private final String TAG = this.getClass().getName();

    // operations constants
    private static final int INSERT_OPERATION = 0;
    private static final int DELETE_OPERATION = 1;

    // constructor
    private RepoImp(){
        initDB();
    }

    public static Repository getInstance(){
        return repository;
    }

    private void initDB() {
        Log.e(TAG, "_DataBaseInit");
        itemDB = Room.databaseBuilder(MyApplication.getAppContext(),
                ItemDatabase.class, "ItemDatabase").build();
    }

    @Override
    public void addItem(Item item) {
        Log.e(TAG, "_ItemIsAddedToDB");
        new DataBaseOperation(item,INSERT_OPERATION).execute();
    }

    @Override
    public void deleteItem(Item item) {
        Log.e(TAG, "_ItemIsDeletedFromDB");
        new DataBaseOperation(item,DELETE_OPERATION).execute();
    }

    @Override
    public LiveData<List<Item>> getItems() {
        Log.e(TAG, "_GetItemsFromDB");
        return itemDB.itemDao().getItems();
    }

    // Async
    class DataBaseOperation extends AsyncTask<Void,Void,Void> {

        public Item item;
        public int operation;

        public DataBaseOperation(Item item, int operation){
            this.item = item;
            this.operation = operation;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Log.e(TAG, "_doInBackgroundInvoked");
            // INSERT operation
            if (operation == INSERT_OPERATION) itemDB.itemDao().insert(item);
            else if (operation == DELETE_OPERATION) itemDB.itemDao().delete(item);
            return null;
        }

    }

}
