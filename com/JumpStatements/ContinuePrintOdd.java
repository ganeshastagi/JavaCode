package com.JumpStatements;

public class ContinuePrintOdd {
    public static void main(String[] args) {
        //Use continue to print only odd numbers
        //Print numbers from 1 to 10, but use continue to skip even numbers.

        for(int i=1; i<=10; i++) {
            if(i%2==0) {
                continue;
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
