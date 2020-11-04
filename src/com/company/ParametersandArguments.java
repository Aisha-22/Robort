package com.company;

public class ParametersandArguments {
    int toalCost = 0;
    public void getMilk(int numberOfBottles, int pricePErUnit) {
       this.toalCost = numberOfBottles * pricePErUnit;

    moveRobot("move right", 2);
        System.out.println("leaveHouse");
        moveRobot("move up", 4);
        moveRobot("move right", 5);
        System.out.println("buy" + numberOfBottles + " bottles of Milk");
        moveRobot("move left", 3);
        moveRobot("move down", 6);
        moveRobot("move left", 1);
        System.out.println("enterHouse");

    }

    private void moveRobot(String direction, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(direction);
        }
    }

    public int getTotalCost() {
        return this.toalCost;
    }

    public double getChange(double money) {
        double change = money - this.toalCost;
        return change;
    }

}
