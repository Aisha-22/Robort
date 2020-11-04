package com.company;
import  com.company.ParametersandArguments;

public class Main {

    public static void main(String[] args) {
	// write your code here

      ParametersandArguments  pa = new ParametersandArguments();
      for (int i = 0; i < pa.numberOfBottles; i++)
      {
          pa.getMilk(3);
          System.out.println("The total number is " + pa.getMilk(3));

      }

        GetMilkSimple getMilkSimple = new GetMilkSimple();

//        System.out.println(getMilkSimple.getTotalPrice(20,  12));


    }
}
