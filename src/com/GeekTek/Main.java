package com.GeekTek;

public class Main {

    public static void main(String[] args) {

        var chrysanthemums = new Chrysanthemums1("Хризантемы", 350);
        chrysanthemums.smells("Рамашковый", 350, 3, 80);
        System.out.println(chrysanthemums.getInfo());
        System.out.println("--------------------------------------");

        Views3 views = new Views3("рамашка", " сферический");
        Chrysanthemums2 chrysanthemums1 = new Chrysanthemums2("шарообразный",180,100, Color4.WHITE);
        System.out.println(chrysanthemums1.getInfo());
        System.out.println("--------------------------------------");

        Chrysanthemums2 chrysanthemums11=new Chrysanthemums2("Хризантемы",
                350,2, Color4.RED);
        Chrysanthemums2 chrysanthemums12=new Chrysanthemums2
                ("Хризантемы",350,2, Color4.PINK);
        System.out.println(chrysanthemums12.getInfo());
        System.out.println("--------------------------------------");



    }

}