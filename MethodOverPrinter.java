public class MethodOverPrinter {
    public static void main(String[] args) {
        //Create a class Printer with overloaded methods print():
        //print(String text)
        //print(int number)
        //print(double number)
        //print(String text, int times) → should print the text that many times.

        printer p = new printer();
        p.print("Hello");
        p.print(47);
        p.print(47.6);
        p.print("Idiot", 3);
    }
}

class printer {
    public void print(String text) {
        System.out.println(text) ;
    }

    public void print(int number) {
        System.out.println(number);
    }

    public void print(double number) {
        System.out.println(number);
    }

    public void print(String text, int times) {
        for(int i=1; i<= times; i++) {
            System.out.println(text);
        }
    }
}
