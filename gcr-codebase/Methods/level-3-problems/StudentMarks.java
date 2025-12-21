import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    // Method to generate random scores for Physics, Chemistry, Maths
    public static int[][] generatePCM(int numStudents) {
        int[][] marks = new int[numStudents][3]; // 3 subjects: PCM
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = rand.nextInt(101); // Physics: 0-100
            marks[i][1] = rand.nextInt(101); // Chemistry: 0-100
            marks[i][2] = rand.nextInt(101); // Maths: 0-100
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[][] studentMarks = generatePCM(numStudents);
        double[][] studentResults = calculateResults(studentMarks);
        displayScorecard(studentMarks, studentResults);
    }
}
