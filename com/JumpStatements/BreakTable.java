package com.JumpStatements;

public class BreakTable {
    public static void main(String[] args) {
        // Use break inside a nested loop
        // Write a nested loop that prints the multiplication table from 1 to 5,
        // but breaks the inner loop if the result is more than 10.

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=12; j++) {
                if(j>10){
                    break;
                }
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
