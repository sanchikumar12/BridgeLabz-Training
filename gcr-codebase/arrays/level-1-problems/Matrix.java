import java.util.*;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        // Filling matrix and 1D array simultaneously
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array elements
        System.out.println("\nThe 1D array elements are:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
