package com.TypeConversionAndCasting;

import java.util.Scanner;

public class ImplicitBasic {
    public static void main(String[] args) {
        //Implicit Type Conversion
        //Write a program that adds an int and a double, and stores the result in a double.
        //Then print the result.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        double d = sc.nextDouble();

        double add = a + d;
        System.out.println(add);
    }
}
