// Program to input marks of Physics, Chemistry and Maths
// and print grade based on percentage

import java.util.Scanner;

public class AverageMark {
    public static void main(String[] args) {
        int physicsMarks;
        int chemistryMarks;
        int mathsMarks;

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take marks as input
        System.out.println("Enter Physics marks:");
        physicsMarks = input.nextInt();

        System.out.println("Enter Chemistry marks:");
        chemistryMarks = input.nextInt();

        System.out.println("Enter Maths marks:");
        mathsMarks = input.nextInt();

        // Calculate percentage
        double percentage = ((physicsMarks + chemistryMarks + mathsMarks) / 300.0) * 100;

        // Print grade
        if (percentage >= 80) {
            System.out.println("Level 4, above agency-normalized standards");
        } 
        else if (percentage >= 70) {
            System.out.println("Level 3, at agency-normalized standards");
        } 
        else if (percentage >= 60) {
            System.out.println("Level 2, below agency-normalized standards");
        } 
        else if (percentage >= 50) {
            System.out.println("Level 1, well below agency-normalized standards");
        } 
        else {
            System.out.println("Remedial standards");
        }

        input.close();
    }
}
