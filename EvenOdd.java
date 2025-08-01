import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args) {
        // Ask the user for a number and check for even and odd

        int n;
        System.out.println("Please enter a Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n % 2 ==0) {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
