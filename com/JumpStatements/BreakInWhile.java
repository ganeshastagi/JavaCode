package com.JumpStatements;

public class BreakInWhile {
    public static void main(String[] args) {
        //Use break in a while loop
        //Print all even numbers starting from 2 using a while loop. Stop when the number exceeds 20.

        int i = 2;
        while(i<=50) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
            if(i>20) {
                break;
            }
            i++;
        }
    }
}
