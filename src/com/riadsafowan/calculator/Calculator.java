package com.riadsafowan.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(" Welcome to Java Calculator \n");
        Scanner scan = new Scanner(System.in);


        System.out.println("\n Please enter two numbers");
        int xe;
        int xo;
        System.out.print("\n First number: ");
        xe = scan.nextInt();
        System.out.print("\n Second number: ");
        xo = scan.nextInt();

        System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
        String Operation = scan.next();
        String EO = "You have selected ";

        switch (Operation) {

            case "*":
                System.out.println(EO + "* \n Your Result: " + (xe * xo));
                break;
            case "/":
                System.out.println(EO + "/ \n Your Result: " + (xe / xo));
                break;
            case "+":
                System.out.println(EO + "+ \n Your Result: " + (xe + xo));
                break;
            case "-":
                System.out.println(EO + "- \n Your Result: " + (xe - xo));
                break;
            default:
                System.out.println("\n Please select a valid character");
        }

        //Close
        scan.close();
        System.out.println(" Closing Application ");
    }
}
