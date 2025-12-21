import java.util.Random;

public class MatrixManipulation {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols, int maxValue) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(maxValue + 1); // 0 to maxValue
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%5d ", val);
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            return null; // No inverse
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = (m[0][2]*m[2][1]-m[0][1]*m[2][2])/det;
        inv[0][2] = (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0] = (m[1][2]*m[2][0]-m[1][0]*m[2][2])/det;
        inv[1][1] = (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = (m[0][2]*m[1][0]-m[0][0]*m[1][2])/det;

        inv[2][0] = (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = (m[0][1]*m[2][0]-m[0][0]*m[2][1])/det;
        inv[2][2] = (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }

    public static void main(String[] args) {
        int maxValue = 10;

        // 2x2 Matrix
        int[][] matrix2x2 = createRandomMatrix(2, 2, maxValue);
        System.out.println("Random 2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose of 2x2 Matrix:");
        displayMatrix(transposeMatrix(matrix2x2));

        double det2x2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant of 2x2 Matrix: " + det2x2);

        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) {
            System.out.println("\nInverse of 2x2 Matrix:");
            displayMatrix(inv2x2);
        } else {
            System.out.println("\n2x2 Matrix has no inverse (Determinant = 0)");
        }

        // 3x3 Matrix
        int[][] matrix3x3 = createRandomMatrix(3, 3, maxValue);
        System.out.println("\nRandom 3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose of 3x3 Matrix:");
        displayMatrix(transposeMatrix(matrix3x3));

        double det3x3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant of 3x3 Matrix: " + det3x3);

        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) {
            System.out.println("\nInverse of 3x3 Matrix:");
            displayMatrix(inv3x3);
        } else {
            System.out.println("\n3x3 Matrix has no inverse (Determinant = 0)");
        }
    }
}
