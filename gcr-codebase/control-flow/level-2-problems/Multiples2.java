// Program to find all the multiples of a number taken as user input below 100

import java.util.Scanner;
public class Multiples2{
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
			int counter = number - 1;
			while ( counter > 1 ){
				if ( number % counter == 0 ) {
					System.out.println( counter );
				}
				counter-- ;
			}
		}
		
		input.close();
	
	}
}
		