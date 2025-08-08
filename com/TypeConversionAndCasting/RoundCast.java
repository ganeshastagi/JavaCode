package com.TypeConversionAndCasting;

import java.util.Scanner;

public class RoundCast {
    public static void main(String[] args) {
        //Convert a double (e.g., 3.75) into int using casting.
        //Also use Math.round(), Math.ceil(), and Math.floor() to show the difference.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a double number: ");
        double d = sc.nextDouble();

        int num = (int) d;
        int round = (int) Math.round(d);        // It rounds the value to the nearest int
        int ceil = (int) Math.ceil(d);          // It rounds up to the nearest int
        int floor = (int) Math.floor(d);        // It rounds down to the nearest int


        System.out.println(num);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);
    }
}
