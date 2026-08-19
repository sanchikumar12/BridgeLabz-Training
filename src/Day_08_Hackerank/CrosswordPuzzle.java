package Day_08_Hackerank;

import java.util.*;

class Result {

    public static String[] crosswordPuzzle(String[] crossword, String[] words) {

        char[][] board = new char[10][10];

        for (int i = 0; i < 10; i++) {
            board[i] = crossword[i].toCharArray();
        }

        String[] wordList = words[0].split(";");

        solve(board, wordList, 0);

        String[] ans = new String[10];

        for (int i = 0; i < 10; i++) {
            ans[i] = new String(board[i]);
        }

        return ans;
    }

    static boolean solve(char[][] board, String[] words, int index) {

        if (index == words.length) {
            return true;
        }

        String word = words[index];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                if (canPlaceHorizontal(board, word, row, col)) {

                    boolean[] changed = placeHorizontal(board, word, row, col);

                    if (solve(board, words, index + 1)) {
                        return true;
                    }

                    undoHorizontal(board, word, row, col, changed);
                }

                if (canPlaceVertical(board, word, row, col)) {

                    boolean[] changed = placeVertical(board, word, row, col);

                    if (solve(board, words, index + 1)) {
                        return true;
                    }

                    undoVertical(board, word, row, col, changed);
                }
            }
        }

        return false;
    }

    static boolean canPlaceHorizontal(char[][] board, String word, int row, int col) {

        if (col + word.length() > 10) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {

            if (board[row][col + i] != '-' &&
                board[row][col + i] != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    static boolean canPlaceVertical(char[][] board, String word, int row, int col) {

        if (row + word.length() > 10) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {

            if (board[row + i][col] != '-' &&
                board[row + i][col] != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    static boolean[] placeHorizontal(char[][] board, String word, int row, int col) {

        boolean[] changed = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {

            if (board[row][col + i] == '-') {
                board[row][col + i] = word.charAt(i);
                changed[i] = true;
            }
        }

        return changed;
    }

    static boolean[] placeVertical(char[][] board, String word, int row, int col) {

        boolean[] changed = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {

            if (board[row + i][col] == '-') {
                board[row + i][col] = word.charAt(i);
                changed[i] = true;
            }
        }

        return changed;
    }

    static void undoHorizontal(char[][] board, String word, int row, int col,
                                boolean[] changed) {

        for (int i = 0; i < word.length(); i++) {

            if (changed[i]) {
                board[row][col + i] = '-';
            }
        }
    }

    static void undoVertical(char[][] board, String word, int row, int col,
                             boolean[] changed) {

        for (int i = 0; i < word.length(); i++) {

            if (changed[i]) {
                board[row + i][col] = '-';
            }
        }
    }
}