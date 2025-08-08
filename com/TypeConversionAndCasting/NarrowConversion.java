package com.TypeConversionAndCasting;

import java.util.Scanner;

public class NarrowConversion {
    public static void main(String[] args) {
        //Write a program that takes a double and converts it to:
        //float
        //int
        //byte
        //Print all conversions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a double number: ");
        double n = sc.nextDouble();

        float f = (float) n;
        int i = (int) n;
        byte b = (byte) n;

        System.out.println(f);
        System.out.println(i);
        System.out.println(b);

    }
}
