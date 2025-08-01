import java.util.Scanner;

public class SumOfFirstNumbers {
    public static void main (String[] s) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println ("The sum is: " + sum);
    }
}
