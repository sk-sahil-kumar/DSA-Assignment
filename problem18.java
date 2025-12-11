import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input target to search
        System.out.print("Enter the number you want to search: ");
        int target = sc.nextInt();

        boolean found = false;

        // Linear search in 2D matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element " + target + " found at position (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the matrix.");
        }

        sc.close();
    }
}
