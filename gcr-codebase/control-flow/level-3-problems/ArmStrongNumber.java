// Program to check if a number is armstrong or not.

import java.util.Scanner;
public class ArmStrongNumber{
	public static void main (String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Store the original number for comparison later
        int copyOfNumber = number;

        // Variable to store sum of cubes of digits
        int sumOfCubes = 0;
		
		 // Loop until all digits of the number are processed
		while(number != 0){
			int remainder = number % 10 ;
			int cubeOfNumber = remainder * remainder * remainder;
			sumOfCubes = sumOfCubes + cubeOfNumber;
			number = number / 10;
		}
		
		// Check whether the original number is equal to the sum of cubes
		System.out.println(copyOfNumber + " " + ( copyOfNumber == sumOfCubes ? "is a armstrong number" 
		                    : "is not a armstrong number"));
		
		input.close();
		
	}
};
		