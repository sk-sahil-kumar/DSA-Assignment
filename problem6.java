import java.util.Scanner;

public class problem6 {

    // Iterative Fibonacci
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci (Iteration): ");

        if (n >= 0) System.out.print(a + " ");
        if (n >= 1) System.out.print(b + " ");

        int c = a + b;
        while (c <= n) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }

        System.out.println();
    }

    // Recursive Fibonacci helper
    public static int fibonacciRecursiveValue(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursiveValue(n - 1) + fibonacciRecursiveValue(n - 2);
    }

    // Print Fibonacci series using recursion
    public static void fibonacciRecursion(int limit) {
        System.out.print("Fibonacci (Recursion): ");
        int i = 0;
        while (true) {
            int val = fibonacciRecursiveValue(i);
            if (val > limit) break;
            System.out.print(val + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit number: ");
        int num = sc.nextInt();

        fibonacciIterative(num);
        fibonacciRecursion(num);

        sc.close();
    }
}
