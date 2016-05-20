package com.kekec_apps.android.happyinvestor.model;

/**
 * Created by Janko on 20.5.2016.
 */
public class StockData {
    private long id;
    private String date;
    private double price;

    public StockData(long id, String date, double price){
        this.id = id;
        this.date = date;
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
