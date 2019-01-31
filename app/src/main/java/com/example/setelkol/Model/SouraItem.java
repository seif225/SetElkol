package com.example.setelkol.Model;

public class SouraItem {
    String soura_name;
    int position;


    public SouraItem(String soura_name) {
        this.soura_name = soura_name;
    }

    public SouraItem(String soura_name, int position) {
        this.soura_name = soura_name;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public String getSoura_name() {
        return soura_name;
    }

    public void setSoura_name(String soura_name) {
        this.soura_name = soura_name;
    }
}
