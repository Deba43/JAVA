package ArrayConstructor;

import java.util.Scanner;

public class SparseMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                sc.close();
            }
        }

        if (isSparse(matrix, rows, columns)) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    }

    public static boolean isSparse(int[][] matrix, int rows, int columns) {
        int zeroCount = 0;
        int totalElements = rows * columns;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        return zeroCount > (totalElements / 2);

    }
}
