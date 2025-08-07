package com.JumpStatements;

import java.util.Scanner;

public class ReturnExit {
    public static void main(String[] args) {
        // Use return to exit a method early
        // Write a method that takes an integer and prints whether it is even or odd.
        // If the number is negative, print “Invalid input” and exit early using return.

        System.out.println("Please enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        EvenOdd eo = new EvenOdd();
        eo.evenOdd(num);
    }
}

class EvenOdd {
    int evenOdd (int num) {
         if(num<0) {
             System.out.println("Invalid input");
             return 0;
         }


        if(num%2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        return 0;
    }
}
