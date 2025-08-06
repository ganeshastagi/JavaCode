package com.JumpStatements;

public class Continue {
    public static void main(String[] args) {
        //Print numbers from 1 to 10, skipping 5 using continue and all the types of loops.
        //The continue statement has to be after the loop and before any other statements.
        // In, while and do while loops, before the continue statement, it needs to have an increment, otherwise it will
        // skip the whole loop and go into infinite loop.

        // For Loop
        for(int i=1; i<=10; i++) {
            if(i==5) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        // While Loop
        int i=1;
        while(i<=10) {
            if(i==5) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Do while loop
        int j=1;
        do {
            if(j==5) {
                j++;
                continue;
            }
            System.out.print(j + " ");
           j++;
        } while(j<=10);

    }
}
