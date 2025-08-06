package com.objects;

public class ClassObjectPractice {
    public static void main (String[] a) {
        //Q1. Create a class Person with fields name and age.
        // Write a method introduce() that prints a greeting. Create two objects and call the method for each.
        person p1 = new person();
        person p2 = new person();

        p1.name = "John";
        p1.age = 21;

        p2.name = "Jim";
        p2.age = 22;

        p1.introduce();
        p2.introduce();
    }
}

class person {
     String name;
     int age;

     void introduce() {

         System.out.println("Hello, Idiot! " + name + " who is "+ age + " years old.");
     }
}
