import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        int students = 5;  // you may change the number of students

        int[][] marks = generateMarks(students);
        double[][] stats = calculateStats(marks);
        char[] grades = calculateGrades(stats);
        displayScorecard(marks, stats, grades);
    }

    // -------------------------------------------------------------
    // Method 1 : Generate Random 2-digit PCM Scores
    // -------------------------------------------------------------
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] arr = new int[n][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            arr[i][0] = rand.nextInt(90) + 10;  // Physics 10–99
            arr[i][1] = rand.nextInt(90) + 10;  // Chemistry
            arr[i][2] = rand.nextInt(90) + 10;  // Maths
        }
        return arr;
    }

    // -------------------------------------------------------------
    // Method 2 : Calculate Total, Average and Percentage
    // -------------------------------------------------------------
    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3]; 
        // stats[i][0] = total
        // stats[i][1] = average
        // stats[i][2] = percentage

        for (int i
