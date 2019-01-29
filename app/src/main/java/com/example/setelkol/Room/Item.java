package com.example.setelkol.Room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity
public class Item {

    @PrimaryKey(autoGenerate = true)
    private int id ;
    private String meal;
    public Item (String meal){
        this.meal=meal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getId() {
        return id;
    }

    public String getMeal() {
        return meal;
    }
}
