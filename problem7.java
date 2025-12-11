import java.util.Scanner;

public class problem7 {

    // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }

        solveHanoi(n - 1, fromRod, auxRod, toRod);  // Move n-1 from source to auxiliary
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        solveHanoi(n - 1, auxRod, toRod, fromRod);  // Move n-1 from auxiliary to destination
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("\nSteps to solve Tower of Hanoi:");
        solveHanoi(n, 'A', 'C', 'B');  // A = source, C = destination, B = helper

        sc.close();
    }
}
