package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        int lengthRectangle = input.nextInt();
        System.out.println("What is the width of the rectangle?");
        int widthRectangle = input.nextInt();
        int area = lengthRectangle * widthRectangle;
        System.out.println("The area of the triangle is: " + area);
    }
}
