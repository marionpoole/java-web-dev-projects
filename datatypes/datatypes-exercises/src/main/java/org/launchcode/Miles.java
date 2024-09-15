package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How much gas have you used(in gallons)?");
        Double gas = input.nextDouble();
        Double mpg = miles / gas;
        System.out.println("You are getting: " + mpg + " mpg.");
    }
}
