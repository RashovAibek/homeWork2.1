package com.GeekTek;

public class Main {

    public static void main(String[] args) {

         Chrysanthemums1 chrysanthemums = new Chrysanthemums1("Советская 11/1", "08:00" ,"21:00", "Цветочник",350);
        chrysanthemums.smells("Рамашковый", 350, 3, 80);
        System.out.println(chrysanthemums.getInfo());
        System.out.println("--------------------------------------");

        Views3 views = new Views3("рамашка", " сферический");
        Chrysanthemums2 chrysanthemums1 = new Chrysanthemums2("шарообразный",180,"советская ", "21:00","21:00",12, Color4.PINK);
        System.out.println(chrysanthemums1.getInfo());
        System.out.println("--------------------------------------");

        Chrysanthemums2 chrysanthemums11=new Chrysanthemums2("Хризантемы",
                350,"Советская", "08:00", "21:00",2,Color4.PINK);
        Chrysanthemums2 chrysanthemums12=new Chrysanthemums2
                ("Хризантемы",350,"Советская","08:00","21:00", 4,Color4.WHITE);
        System.out.println(chrysanthemums12.getInfo());
        System.out.println("--------------------------------------");



    }

}