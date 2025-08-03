public class MethodStudent {
    public static void main (String [] a) {
        // Create a class Student with method setDetails(String name, int marks)
        // and another method showDetails() to print them.

        Student s1 = new Student();
        s1.setDetails("Dwight", 89);
        s1.showDetails();

        System.out.println();

        Student s2 = new Student();
        s2.setDetails("Jim", 90);
        s2.showDetails();
    }
}

class Student {

    String name;
    int marks;

    void setDetails(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showDetails() {
       System.out.println("Name: " + name);
       System.out.println("Marks: "+ marks);
    }
}