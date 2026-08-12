package Day_08_Classroom;

import java.util.*;

public class N_Queens {

    public static void main(String[] args) {

        int n = 4;
        int[][] board = new int[n][n];

        boolean ans = nQueens(board, 0);

        System.out.println(ans);

        if (ans) {
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
        }
    }

    public static boolean nQueens(int[][] board, int row) {

        if (row >= board.length) {
            return true;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                if (nQueens(board, row + 1)) {
                    return true;
                }

                // backtracking
                board[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col) {

        int n = board.length;

        // column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        // upper-right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
}