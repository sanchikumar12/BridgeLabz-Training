import java.util.Scanner;

public class BMICalculator {

    public void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal Weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMICalculator bmiCalc = new BMICalculator();

        double[][] members = new double[10][3];

        for (int i = 0; i < members.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();
        }

        bmiCalc.calculateBMI(members);
        String[] status = bmiCalc.getBMIStatus(members);

        System.out.println("\n---- BMI REPORT ----");
        for (int i = 0; i < members.length; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s%n",
                    (i + 1), members[i][0], members[i][1], members[i][2], status[i]);
        }

        sc.close();
    }
}
