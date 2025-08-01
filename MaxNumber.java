import java.util.*;

public class MaxNumber {
    public static void main (String[] a) {
        // Ask the user for two numbers and print the maximum of 2 numbers

        int n1, n2, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1>n2) {
            System.out.println ("This is the max: " + n1);
        }
        else {
            System.out.println("This is the max: "+ n2);
        }
    }
}
