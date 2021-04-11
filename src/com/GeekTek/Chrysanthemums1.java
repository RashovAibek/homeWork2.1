package com.GeekTek;

import javax.naming.Name;

public class Chrysanthemums1 extends FlowerShop {
    private String name;
    private int price;

    public Chrysanthemums1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void smells( String name, int price, int quantity, int height){
        System.out.println("\nРамашковый-"+name+ "\nЦены-"+price+"\nколичество-" + quantity +
                "\nвысота-" + height);
    }

    public void smells (int height){
        System.out.println(height);
    }

    public String getInfo(){
        return "\nназвание-"+name+"\nцена-"+price;
    }
}
