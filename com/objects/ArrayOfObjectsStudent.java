package com.objects;

public class ArrayOfObjectsStudent {
    public static void main(String [] args) {
        //Create a Student class with name and marks.
        //Make an array of 3 students and print their details using a loop.

        Student s1 = new Student();
        s1.name = "Oscar";
        s1.marks = 80;

        Student s2 = new Student();
        s2.name = "Kevin";
        s2.marks = 70;

        Student s3 = new Student();
        s3.name = "Angela";
        s3.marks = 75;

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        for (Student stu : s) {
            System.out.println("Name: " + stu.name + " Age: " + stu.marks);
        }
    }
}

class Student{
    String name;
    int marks;

}
