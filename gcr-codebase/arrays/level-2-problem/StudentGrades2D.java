import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array: rows = students, columns = subjects
        int[][] marks = new int[n][3];

        // Input
        System.out.println("\nEnter marks for each student (Physics, Chemistry, Maths): ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Processing
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            float percentage = total / 3.0f;

            char grade;
            if (percentage >= 90) grade = 'A';
            else if (percentage >= 80) grade = 'B';
            else if (percentage >= 70) grade = 'C';
            else if (percentage >= 60) grade = 'D';
            else grade = 'F';

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
}
