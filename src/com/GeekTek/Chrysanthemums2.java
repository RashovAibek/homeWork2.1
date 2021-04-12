package com.GeekTek;

public class Chrysanthemums2 extends Chrysanthemums1 {

    private int views1;
    private Color4 color;

    public Chrysanthemums2(String name, int price,String address, String open, String close, int views1, Color4 color) {
        super( close,open,address,name, price);
        this.views1 = views1;
        this.color = color;
    }

    public int getViews1() {
        return views1;
    }

    public Color4 getColor() {
        return color;
    }

    final  public String  getInfo(){
        return super.getInfo()+"\nколичество видов-"+views1+"\nвид рамашка-"+ views1
                +"\nсферический-"+views1+"\nцвет-"+color;
    }
}

