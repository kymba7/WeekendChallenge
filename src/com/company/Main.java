package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner robo = new Scanner(System.in);

        Boolean ask = true;

        while (ask) {
            System.out.println("Would you like to use the calculator?");
            String userAnswer = robo.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {

                System.out.println("welcome to the calcualtor. Please enter a number.");

                String userinput = robo.nextLine();
                System.out.println("Please choose +, -, *, or /");
                String userinput2 = robo.nextLine();
                System.out.println("Please enter the next number for your calculation");
                String userinput3 = robo.nextLine();

                int firstN = Integer.parseInt(userinput);
                int thirdN = Integer.parseInt(userinput3);
                int finalResult = 0;


                if (userinput2.equals("+")) {
                    finalResult = firstN + thirdN;
                } else if (userinput2.equals("-")) {
                    finalResult = firstN - thirdN;
                } else if (userinput2.equals("*")) {
                    finalResult = firstN * thirdN;
                } else if (userinput2.equals("/")) {
                    finalResult = firstN / thirdN;
                }


                System.out.println("Here is your final number: " + finalResult);


            } else{
                ask = false;
            System.out.println("Goodbye");

        }}
    }}



       // System.out.println("Pick which function you would like to use: Add, Subtract, Multiply or Divide");
        //String[]prompt = {"Please select a function: Add, Subtract, Multiply or Divide."};
       // String[] userInformation = ("");

      //  List<String> calcs = new ArrayList<>();
       // calcs.add("+");
      //  calcs.add(-);
      //  calcs.add(*);
       // calcs.add(/);




