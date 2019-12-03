package com.Nhan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Orderline s = new Orderline();
        s.setName("laptop");
        s.setPrice(500);
        s.setQuantity(10);

        Orderline s1 = new Orderline();
        s1.setName("smartphone");
        s1.setPrice(200);
        s1.setQuantity(6);

        System.out.println("Name: "+ s.getName() + " "+ s.getPrice() +" " +s.getQuantity() +" "+ s. priceOfOrder());
        System.out.println("Name: "+ s1.getName() + " "+ s1.getPrice() +" " +s1.getQuantity() +" "+ s1. priceOfOrder());



        Orderline2 program = new Orderline2();
        program.process();


        //ASSIGNMENT 4


    }
}
