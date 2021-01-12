package com.example.myfinalproject;

public class SaveData {
     String saveDataId;
     String name;
     String Price;
     String date;

    public SaveData(){

    }

    public SaveData(String saveDataId, String name, String price, String date) {
        this.saveDataId = saveDataId;
        this.name = name;
        Price = price;
        this.date = date;
    }

    public String getSaveDataId() {
        return saveDataId;
    }

    public void setSaveDataId(String saveDataId) {
        this.saveDataId = saveDataId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
