package com.GeekTek;

public class FlowerShop {

    private String address;
    private double open;
    private double close;


    public FlowerShop(String address, double open, double close) {
        this.address = address;
        this.open = open;
        this.close = close;
    }

    public FlowerShop(){

    }

    public String getAddress() {
        return address;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

}

