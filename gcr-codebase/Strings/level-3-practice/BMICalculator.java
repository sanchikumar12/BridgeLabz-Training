import java.util.Scanner;

public class BMICalculator {

    //  Method to find BMI and Status
    public static String[][] findBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100; // cm to meter
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 40)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    //  Method to display the report
    public static void displayReport(String[][] result) {

        System.out.println("\nBMI REPORT");
        System.out.println("-----------------------------------------------");
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                result[i][0] + "\t\t" +
                result[i][1] + "\t\t" +
                result[i][2] + "\t\t" +
                result[i][3]
            );
        }
    }

    //  Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a) Take input and store in 2D array
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        //  Call user-defined method
        String[][] result = findBMI(data);

        displayReport(result);
    }
}
