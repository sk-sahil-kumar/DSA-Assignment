public class problem3 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8, 9},
                {1, 2, 3}
        };

        // Matrix Addition
        System.out.println("Matrix A + B:");
        int[][] sum = addMatrices(A, B);
        printMatrix(sum);

        // Matrix Multiplication
        int[][] C = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] D = {
                {7, 8, 9},
                {1, 2, 3}
        };

        System.out.println("\nMatrix C x D:");
        int[][] mul = multiplyMatrices(C, D);
        printMatrix(mul);
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for(int i = 0; i < rowsA; i++) {
            for(int j = 0; j < colsB; j++) {
                for(int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
