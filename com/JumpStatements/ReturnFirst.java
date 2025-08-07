package com.JumpStatements;

import java.util.Scanner;

public class ReturnFirst {
    public static void main(String[] args) {
        // Use return in a method to return a value
        // Write a method int square(int num) that returns the square of a number. Call it in main() and print the result.

        SquareCalc sq = new SquareCalc();
        System.out.println("Please enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sq.square(num);
        System.out.println(result);
    }
}

class SquareCalc {

    int square(int num) {
        return num * num;
    }
}