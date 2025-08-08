package com.TypeConversionAndCasting;

import java.util.Scanner;

public class MixedConversion {
    public static void main(String[] args) {
        //Mixed-Type Expression
        //Write a program that adds int, float, and double in a single expression.
        //Observe and print the final result and its type.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a int num: ");
        int n = sc.nextInt();
        System.out.println("Please enter a float num: ");
        float f = sc.nextFloat();
        System.out.println("Please enter a double num: ");
        double d = sc.nextDouble();

        // Prints in double format because double has the highest precision
        System.out.println((n + f + d));

    }
}
