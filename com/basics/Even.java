package com.basics;

public class Even {
    public static void main (String [] args) {
        // Print com.basics.Even numbers from 0 to 100
        for(int i=1 ; i<=100 ; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
