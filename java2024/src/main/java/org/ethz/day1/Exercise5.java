package org.ethz.day1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the integer (e.g. 5209): ");
        double integer = input.nextInt();
        double remainder = 0;
        double all= 1;
        while (integer > 1) {
            remainder = integer % 10; //eg remainder is 9
            System.out.println("The remainder is: " + remainder );

            all = remainder * all; //eg all = 9*1
            System.out.println("The all is: " + all );

            integer = integer / 10 - remainder/10; // eg integer is 5209 / 10 = (520.9) - 9/10 = 0.9 = 520. 
            System.out.println("The integer is: " + integer );

        }
        System.out.println("The multiplication is: " + all );
    }
}