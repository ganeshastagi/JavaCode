package com.TypeConversionAndCasting;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        //Write a program that takes a numeric String like "123" and converts it into int using Integer.parseInt().

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string in numeric value: ");
        String s = sc.nextLine();

        // Before converting into int it is still a string so if you try to print it, it will behave like a string
        System.out.println(s+12);

        // After converting, it will behave like an int
        int result = Integer.parseInt(s);
        System.out.println(result+12);

    }
}
