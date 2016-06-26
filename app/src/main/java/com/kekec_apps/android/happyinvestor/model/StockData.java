package com.kekec_apps.android.happyinvestor.model;

/**
 * Created by Janko on 20.5.2016.
 */
public class StockData {

    private String symbol;
    private double ask;
    private double bid;
    private String last_trade_date;
    private double low;
    private double high;
    private double low52Weeks;
    private double high52Weeks;
    private Integer volume;
    private double open;
    private double close;


    public StockData(String symbol, double ask, double bid, String lastTradeDate, double low, double high, double low52Weeks, double high52Weeks, Integer volume, double open, double close) {
        this.symbol = symbol;
        this.ask = ask;
        this.bid = bid;
        this.last_trade_date = lastTradeDate;
        this.low = low;
        this.high = high;
        this.low52Weeks = low52Weeks;
        this.high52Weeks = high52Weeks;
        this.volume = volume;
        this.open = open;
        this.close = close;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getAsk() {
        return ask;
    }

    public double getBid() {
        return bid;
    }

    public String getLastTradeDate() {
        return last_trade_date;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public double getLow52Weeks() {
        return low52Weeks;
    }

    public double getHigh52Weeks() {
        return high52Weeks;
    }

    public Integer getVolume() {
        return volume;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }
}
