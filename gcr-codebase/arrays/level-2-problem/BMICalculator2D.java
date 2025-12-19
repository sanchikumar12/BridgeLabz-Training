import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // personData[row][0] = weight
        // personData[row][1] = height
        // personData[row][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            // ----- Input Weight -----
            double weight;
            do {
                System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0)
                    System.out.println("Weight must be a positive value.");
            } while (weight <= 0);

            // ----- Input Height -----
            double height;
            do {
                System.out.print("Enter height of person " + (i + 1) + " (meters): ");
                height = sc.nextDouble();
                if (height <= 0)
                    System.out.println("Height must be a positive value.");
            } while (height <= 0);

            // Calculate BMI = weight / height²
            double bmi = weight / (height * height);

            // Store in 2D array
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n===== Person Data =====");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " m");
            System.out.printf("BMI    : %.2f\n", personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
        }

        sc.close();
    }
}
