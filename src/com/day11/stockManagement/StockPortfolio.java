package com.day11.stockManagement;

import java.util.ArrayList;


public class StockPortfolio {

    private String share_name;
    private double share_price;
    private double no_of_shares;
    private ArrayList <String> shar_nam = new ArrayList<>();
    private ArrayList <Double> shar_nos = new ArrayList<>();
    private ArrayList <Double> shar_pric = new ArrayList<>();

    // Getter and setter
    public String getShare_name(){
        return share_name;
    }
    public void setShare_name(String share_name){
        this.share_name = share_name;
    }
    public double getShare_price(){
        return share_price;
    }
    public void setShare_price(double share_price){
        this.share_price = share_price;
    }
    public double getNo_of_shares(){
        return no_of_shares;
    }
    public void setNo_of_shares(double no_of_shares){
        this.no_of_shares = no_of_shares;
    }

    public ArrayList getShar_nam(){
        return shar_nam;
    }
    public void setShar_nam(ArrayList shar_nam){
        this.shar_nam = shar_nam;
    }
    public ArrayList getShar_nos(){
        return shar_nos;
    }
    public void setShar_nos(ArrayList shar_nos){
        this.shar_nos = shar_nos;
    }
    public ArrayList getShar_pric(){
        return shar_pric;
    }
    public void setShar_pric(ArrayList shar_pric){
        this.shar_pric = shar_pric;
    }
}