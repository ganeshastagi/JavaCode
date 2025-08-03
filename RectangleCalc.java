import java.util.Scanner;

public class RectangleCalc {
    public static void main (String [] a) {
        //Create a class Rectangle with fields length and width, and a method area() that returns the area.
        // Create an object, set the values, and print the area.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length and width: ");
        double l, w;
        l = sc.nextDouble();
        w = sc.nextDouble();

        Rectangle r = new Rectangle();
        double area = r.area(l, w);
        System.out.println("The area is " + area);

    }
}

class Rectangle {

    double area(double l, double w) {
        return l * w;
    }
}