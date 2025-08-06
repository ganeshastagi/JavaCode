package com.basics;

import java.util.Scanner;

public class AgeChecker {
    public static void main (String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter your age: ");
        age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("You're an Adult! Go get a Job, idiot!");
        }
        else {
            System.out.println("Get out of your mother basement.");
        }
    }
}
