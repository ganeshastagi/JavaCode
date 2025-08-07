package com.JumpStatements;

public class ContinueTable {
    public static void main(String[] args) {
        //Use continue inside a nested loop
        //Write a nested loop that skips printing multiplication results when either number is 3.

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=10; j++) {
                if(i==3 || j==3) {
                    continue;
                }
                else {
                    System.out.println(i + " x " + j + " = " + i*j);
                }
            }
            System.out.println();
        }
    }
}
