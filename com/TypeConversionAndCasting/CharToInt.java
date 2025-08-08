package com.TypeConversionAndCasting;

import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        // Char to Int Conversion
        // Take a char input from the user (like 'A') and print its ASCII value (as an int).

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a single char: ");
        char c = sc.next().charAt(0);

        System.out.println((int) c);

    }
}
