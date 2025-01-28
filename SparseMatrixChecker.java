import java.util.Scanner;

public class SparseMatrixChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input: Matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is sparse
        if (isSparseMatrix(matrix, rows, cols)) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }

        scanner.close();
    }

    // Method to check if a matrix is sparse
    public static boolean isSparseMatrix(int[][] matrix, int rows, int cols) {
        int zeroCount = 0;
        int totalElements = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        // A matrix is sparse if more than half of its elements are zero
        return zeroCount > totalElements / 2;
    }
}
