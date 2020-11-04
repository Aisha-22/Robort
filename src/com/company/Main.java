package com.company;
import  com.company.ParametersandArguments;

public class Main {

    public static void main(String[] args) {
	// write your code here

      ParametersandArguments  parametersandArguments = new ParametersandArguments();

      parametersandArguments.getMilk(5, 15);
      System.out.println("total cost is R" + parametersandArguments.getTotalCost());
      System.out.println("change is R" + parametersandArguments.getChange(200.00));




    }
}
