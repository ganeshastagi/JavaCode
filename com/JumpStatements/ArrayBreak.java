package com.JumpStatements;

public class ArrayBreak {
    public static void main (String[] args) {
        //Find the first even number in an array using break
        // int[] numbers = {1, 3, 7, 8, 9, 10};

        // For loop for first even number
        int n[] = {1, 3, 7, 8, 9, 10};
        int evencount = 0;
        for(int i=0; i<n.length; i++) {
            if(n[i] % 2 == 0) {
                System.out.println("The first even number is: " + n[i]);
                break;
            }
        }


        // For loop for second even number
        for (int i=0; i<n.length; i++) {
            if(n[i] % 2 != 0) {
                continue;
            }
            evencount++;

            if(evencount==2) {
                System.out.println("The second even number is: " + n[i]);
                break;
            }
        }

    }
}
