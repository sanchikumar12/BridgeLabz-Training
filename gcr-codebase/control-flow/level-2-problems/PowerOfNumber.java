// Program to find the power of a number.

import java.util.Scanner;
public class PowerOfNumber{
	public static void main(String[] args){
		int number;
		int power;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number and power as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		System.out.println("Enter the power : ");
		power = input.nextInt();
		
		// Create the result variable to store the power of number
		int result = 1;
		
		// Use the loop to calculate the power of number
		for ( int i = 1 ; i <= power ; i++ ){
			result = result * number;
		}
		
		// Print the result
		System.out.println("The power " + power + " of " + number + " is " + result);
		
		input.close();
		
	}
}