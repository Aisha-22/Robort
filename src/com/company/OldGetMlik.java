package com.company;

public class OldGetMlik {

    int numberOfBottles = 15;

    public int getMilk(int money) {
        System.out.println("leaveHouse");
        System.out.println("moveRight");
        System.out.println("moveRight");
        System.out.println("moveUp");
        System.out.println("moveUp");
        System.out.println("moveUp");
        System.out.println("moveUp");
        System.out.println("moveRight");
        System.out.println("moveRight");


        System.out.println("buy" + numberOfBottles + " bottles of Milk");
        System.out.println("moveLeft");
        System.out.println("moveLeft");
        System.out.println("moveDown");
        System.out.println("moveDown");
        System.out.println("moveDown");
        System.out.println("moveDown");
        System.out.println("moveLeft");
        System.out.println("moveLeft");
        System.out.println("enterHouse");

        int totalPrice = numberOfBottles * money;


        return totalPrice;

        //Loop dose is run a block of code over and over
        //Calling a Method in a loop
    }
}