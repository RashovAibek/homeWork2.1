package com.GeekTek;

public class FlowerShop {

    private String address;
    private String open;
    private String close;


    public FlowerShop(String address, String open, String close) {
        this.address = address;
        this.open = open;
        this.close = close;
    }

    public FlowerShop(){

    }

    public String getAddress() {
        return address;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

}

