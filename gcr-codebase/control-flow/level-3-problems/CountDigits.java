  // Program to count the number of digits in an integer

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int number;

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take integer input from the user
        System.out.println("Enter the number : ");
        number = input.nextInt();

        // Variable to count digits
        int count = 0;
		
		// calculate the count of number
		if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {

                // Remove the last digit
                number = number / 10;

                // Increase count by 1
                count++;
            }
        }
		
		// print the count of number
		System.out.println("Count of digit is " + count);
		
		input.close();
		
	}
}
		