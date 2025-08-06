package com.basics;

import java.util.Scanner;

public class NumSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Num: ");
        int n1, n2;
        n1 = sc.nextInt();
        System.out.println("Please enter a second num: ");
        n2 = sc.nextInt();

        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println(n1 + " " + n2);
    }
}
