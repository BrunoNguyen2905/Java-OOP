package com.Nhan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        rectangle rec1 = new rectangle(1,2,3,4);

        System.out.println("Rectangele1's width is: "+ rec1.width() + " and height is: " + rec1.height()+" and the area is: "+ rec1.area());

        rectangle rec2 = new rectangle(5,6);

        System.out.println("Rectangele1's width is: "+ rec2.width() + " and height is: " + rec2.height()+" and the area is: "+ rec2.area());

        rectangle rec3 = new rectangle();

        System.out.println("Rectangele1's width is: "+ rec3.width() + " and height is: " + rec3.height()+" and the area is: "+ rec3.area());
    }
}
