// Program to find all the multiples of a number taken as user input below 100

import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
		int number;
	
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
	    
		// Check the number is a positive integer and less than 100.
		if ( number > 0 && number < 100 ){
			// Run a for loop backward
			for ( int i = 100 ; i >= 1 ; i-- ){
				if ( number % i == 0 ) {
					System.out.println( i );
				}
			}
		}
		
		input.close();
	
	}
}
		