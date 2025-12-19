// Program to find the BMI of a person

import java.util.Scanner;
public class BMI{
	public static void main (String[] args){
		double weight;
		double height;
		
		// Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take weight and height input from the user
        System.out.println("Enter the weight : ");
        weight = input.nextDouble();
		System.out.println("Enter the weight : ");
        weight = input.nextDouble();

        // convert height from cm to meter
        double heightMeter = height / 100;
		
        // Calculate the BMI of person
		double bmi =  weight / (height * height);
		
		
		if (bmi <= 18.4) {
            System.out.println("Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } 
        else {
            System.out.println("Obese");
        }

        // Close Scanner
        input.close();
    }
}