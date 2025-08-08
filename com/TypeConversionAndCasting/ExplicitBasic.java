package com.TypeConversionAndCasting;

import java.util.Scanner;

public class ExplicitBasic {
    public static void main(String[] args) {
        // Explicit Type Casting
        // Write a program to divide two int values and type cast the result into float.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        float result = (float) a / b ;

        System.out.println(result);

    }
 }
