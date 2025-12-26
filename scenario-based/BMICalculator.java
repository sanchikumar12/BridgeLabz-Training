//create BMICalculator that calculate the BMI
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
		
        //create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to Maya's BMI fitness Tracker!");
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        //BMI formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
        // Close the scanner
        scanner.close();
    }
}
