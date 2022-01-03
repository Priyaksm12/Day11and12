package com.day11.DataProcessing;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CompanyShares {
    private ArrayList<String> stock_symbol = new ArrayList<>();
    private ArrayList<Integer> stock_nos = new ArrayList<>();
    private ArrayList<Double> stock_val = new ArrayList<>();
    private ArrayList<LocalDateTime> dat_time = new ArrayList<>();

    public ArrayList<String> getStock_symbol(){
        return stock_symbol;
    }
    public void setStock_symbol(ArrayList<String> stock_symbol){
        this.stock_symbol = stock_symbol;
    }
    public ArrayList<Integer> getStock_nos(){
        return stock_nos;
    }
    public void setStock_nos(ArrayList<Integer> stock_nos){
        this.stock_nos = stock_nos;
    }
    public ArrayList<Double> getStock_val(){
        return stock_val;
    }
    public void setStock_val(ArrayList<Double> stock_val){
        this.stock_val = stock_val;
    }
    public ArrayList<LocalDateTime> getdat_time(){
        return dat_time;
    }
    public void setDat_time(ArrayList<LocalDateTime> dat_time){
        this.dat_time = dat_time;
    }
}
