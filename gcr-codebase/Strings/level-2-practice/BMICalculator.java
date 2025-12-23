import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI 
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];      // weight in kg
            double heightCm = personData[i][1];    // height in cm

            // convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            personData[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3];

        // Taking input from user
        for (int i = 0; i < personData.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }
        calculateBMI(personData);
        String[] bmiStatus = determineBMIStatus(personData);
        System.out.println("\nBMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");

        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",(i + 1),personData[i][0],personData[i][1],personData[i][2], bmiStatus[i]);
        }
    }
}
