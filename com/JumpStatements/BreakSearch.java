package com.JumpStatements;

import java.util.Scanner;

public class BreakSearch {
    public static void main(String[] args) {
        // Use break to search for an element in an array
        // Write a program to search for a number in an array. If found, print "Found" and break the loop.

        System.out.println("Please enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean bool = false;

        // Array declaration and accepting array elements from the user.
        int[] a = new int[size];
        System.out.println("Please enter the elements of an array: ");
        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Please enter the element to be found: ");
        int found = sc.nextInt();


        // Searching in the array, if found then break the loop
        for(int i=0;i<a.length; i++) {
            if(a[i] == found){
                System.out.println("Element found at location: " + a[i]);
                bool = true;
                break;
            }
        }
        if(!bool) {
            System.out.println("Element not found.");
        }
    }
}
