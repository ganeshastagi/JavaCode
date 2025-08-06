package com.methods;

public class MethodOverload {
    public static void main(String [] args) {
        // Create a class com.methods.MathOperations with overloaded multiply() methods:
        //multiply(int a, int b)
        //multiply(double a, double b)
        //multiply(int a, int b, int c)
        //Use them in main and show the results.

        MathOperations m = new MathOperations();
        int res1= m.multiply(3, 4);
        double res2 = m.multiply(3.4, 4.3);
        int res3 = m.multiply(3, 4, 5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

class MathOperations {

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply (int a, int b, int c) {
        return a * b * c;
    }
}