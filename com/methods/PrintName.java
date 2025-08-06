package com.methods;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        // Create a method that prints "Hello, [name]!" when called

        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // Greet class object creation.
        Greet g = new Greet();
        g.greet(name);              // Calling a greet method from the Greet class with a parameter.
    }
}

class Greet{

    void greet (String name) {
        System.out.println("Hello, " + name + "!");
    }
}
