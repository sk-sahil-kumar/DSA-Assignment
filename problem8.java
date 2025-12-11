import java.util.Scanner;

public class problem8 {

    // Recursive function to print numbers from 1 to n
    public static void printNumbers(int i, int n) {
        if (i > n)
            return;

        System.out.print(i + " ");
        printNumbers(i + 1, n); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        printNumbers(1, n);

        sc.close();
    }
}
