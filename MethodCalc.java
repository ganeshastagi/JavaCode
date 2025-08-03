import java.util.Scanner;

public class MethodCalc {
    public static void main (String [] a) {
        //Create a class Calculator with methods:
        //add(int a, int b)
        //subtract(int a, int b)
        //multiply(int a, int b)
        //divide(int a, int b)
        //Use them in main() and print the results.

        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        Calculator calc = new Calculator();
        int add = calc.add(n1, n2);
        int sub = calc.sub(n1, n2);
        int mul = calc.multiply(n1, n2);
        int div = calc.divide(n1, n2);
        System.out.println("Addition: "+ add + " Subtraction: " + sub + " Multiplication: " + mul + " Division: " + div);

    }
}


class Calculator {
    int add (int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a-b;
    }

    int multiply (int a, int b) {
        return a*b;
    }

    int divide (int a, int b) {
        return a/b;
    }
}