// Program to check if a number is a Harshad Number

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        int number;

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take number as input from user
        System.out.println("Enter the number : ");
        number = input.nextInt();

        // Store original number for divisibility check
        int originalNumber = number;

        // store sum of digits
        int sum = 0;

        // Loop to calculate sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
		
		// check and print whether the number is Harshad Number or not
		System.out.println( originalNumber + " " + (sum != 0 && originalNumber % sum == 0 
		                     ? "is a Harshad Number" : "is not a Harshad Number");
							 
		input.close();
		
	}
}

        