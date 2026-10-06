import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }

        if (n == 0 || n == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}