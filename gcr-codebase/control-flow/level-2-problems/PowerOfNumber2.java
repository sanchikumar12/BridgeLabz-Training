// Program to find the power of a number using while loop.

import java.util.Scanner;
public class PowerOfNumber2{
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
		int i = 1 ;
		while ( i <= power ){
			result = result * number;
			i++ ;
		}
		
		// Print the result
		System.out.println("The power " + power + " of " + number + " is " + result);
		
		input.close();
		
	}
}