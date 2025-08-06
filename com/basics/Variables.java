package com.basics;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // Write a program to store and print:
        //Your name (String)
        //Your age (int)
        //Your height (float/double)
        //Whether you're a student (boolean)

        String name = "Ganesh";
        int age = 23;
        double height = 5.10;
        System.out.println("Are you a student: y/n ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c == 'y' || c == 'Y') {
            System.out.println("Name: " + name + " Age: " + age + " Height " + height);
        }
        else {
            System.out.println("You're an Imposter!");
        }
    }
}
