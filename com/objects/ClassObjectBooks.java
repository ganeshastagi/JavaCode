package com.objects;

public class ClassObjectBooks {
    public static void main (String [] a) {
        //Create a class com.objects.Book with title, author, and price.
        // Write a method to display the book details. Create and display three book objects.

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.title = "Tools of Titans";
        b1.author = "Tim Ferris";
        b1.price = 24.55;

        b2.title = "The Alchemist";
        b2.author = "Paulo Chelo";
        b2.price = 20.55;

        b3.title = "The Mocking Bird";
        b3.author = "I don't know";
        b3.price = 18.49;

        b1.bookDetails();
        b2.bookDetails();
        b3.bookDetails();
    }
}

class Book {
    String title;
    String author;
    double price;

    void bookDetails () {
        System.out.println(title + " " + author + " " + price + " ");
    }
}