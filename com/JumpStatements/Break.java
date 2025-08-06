package com.JumpStatements;

public class Break {
    public static void main(String[] args) {
        // Print numbers from 1 to 10, but stop at 5 using break and all loops

        for(int i=1; i<=10; i++) {
            System.out.print(i);
            if(i==5) {
                break;
            }
        }

        System.out.println();

        int i = 1;
        while(i<=10) {
            System.out.print(i);
            if(i==5) {
                break;
            }
            i++;
        }

        System.out.println();

        int j=1;
        do {
            System.out.print(j);
            if(j==5) {
                break;
            }
            j++;
        } while(j<=10);

    }
}
