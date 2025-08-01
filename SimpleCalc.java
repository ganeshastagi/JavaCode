import java.util.Scanner;

public class SimpleCalc {
    public static void main (String [] args) {
        // Simple Calculator : Ask the user for two numbers and display Add, Sub, Product and Quotient.

        int num1, num2;
        int add, sub, mul, rem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first num: ");
        num1 = sc.nextInt();
        System.out.println("Please enter Second num: ");
        num2 = sc.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        rem = num1 / num2;
        System.out.println("Addition :" + add);
        System.out.println("Difference :" + sub);
        System.out.println("Product :" + mul);
        System.out.println("Quotient :" + rem);
    }
}
