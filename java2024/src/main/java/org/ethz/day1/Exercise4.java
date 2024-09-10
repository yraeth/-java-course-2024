package org.ethz.day1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = input.nextDouble();
        final double PI = 3.14159;
        double area = radius * PI;
        double circumference = 2*PI*radius;
        System.out.println("The area is: " + area + "and the circumference is: " + circumference);
    }
}

