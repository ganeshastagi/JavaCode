package com.TypeConversionAndCasting;

import java.util.Scanner;

public class WidenConversion {
    public static void main(String[] args) {
        //Widening Conversion
        //Declare a byte value and convert it into:
        //int
        //float
        //double

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a byte number: ");
        byte b = sc.nextByte();

        // Inline conversion
        System.out.println((int) b);
        System.out.println((float) b);
        System.out.println((double) b);

    }
}
