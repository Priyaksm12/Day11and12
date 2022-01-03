package com.day11.DataProcessing;

public interface CustomerAccountData {

    public void stockAccount (String stock_name,int stock_nos, double stock_val);
    public double valueOf();
    public void buy(int amount,double value, String symbol);
    public void sell(int amount,double value, String symbol);
    public void save(String filename);
    public void printreport();
}
