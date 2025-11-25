import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order N of the matrix: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create matrix1 and matrix2
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];

        // Fill matrices with values
        fillMatrix(matrix1, 1);
        fillMatrix(matrix2, 2);

        // Print Matrix 1
        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);

        // Print Matrix 2
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        // Add matrices
        int[][] result = addMatrices(matrix1, matrix2);

        // Print result
        System.out.println("\nResultant Matrix (Matrix1 + Matrix2):");
        printMatrix(result);
    }

    // Fill a matrix with sequential values
    private static void fillMatrix(int[][] matrix, int startValue) {
        int value = startValue;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    // Add two matrices
    private static int[][] addMatrices(int[][] m1, int[][] m2) {
        int N = m1.length;
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // Print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
