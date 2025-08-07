package com.JumpStatements;

import java.util.Scanner;

public class ContinueVowels {
    public static void main(String[] args) {
        //Use continue to skip vowels in a string
        //Write a program to read a string and print only consonants by skipping vowels using continue.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = sc.nextLine();

        // To convert the string into array
        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i++) {
            if(c[i] == 'a' || c[i] == 'A' || c[i] == 'e' || c[i] == 'E' || c[i] == 'i'|| c[i] == 'I'|| c[i] == 'o' || c[i] == 'O'
                    || c[i] == 'u' || c[i] == 'U') {
                continue;
            } else {
                System.out.print(c[i] + " ");
            }
        }
    }
}
