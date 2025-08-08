package com.TypeConversionAndCasting;

import java.util.Scanner;

import static java.lang.String.*;

public class IntToString {
    public static void main(String[] args) {
        // Integer to String Conversion
        // Convert an int (e.g., 456) into a String and print it along with some text like "The number is: 456"

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        // Converts Int to string, and it is only for int type
        String s = Integer.toString(num);

        // Converts any primitive into string
        String str = String.valueOf(num);
        System.out.println("String is " + str + 12);

        num = num+12;
        System.out.println("Number is " + num);
    }
}
