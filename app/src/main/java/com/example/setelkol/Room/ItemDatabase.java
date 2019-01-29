package com.example.setelkol.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {Item.class}, version = 1)
public abstract class ItemDatabase extends RoomDatabase {

        public abstract Dao itemDao();
}
