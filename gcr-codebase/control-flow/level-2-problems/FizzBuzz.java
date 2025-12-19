// Program FizzBuzz, take a number as user input, and check for a positive integer

import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		int number;
	
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Checking if the number is Positive integer
		if ( number >= 1 ){
			// Using loop to display th number
			for ( int i = 1 ; i <= number ; i++){
				if( i % 3 == 0 && i % 5 != 0) {
					System.out.println("Fizz");
				} else if ( i % 3 != 0 && i % 5 == 0) {
					System.out.println("Buzz");
				} else if ( i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println( i );
				}
			}
		} else {
			System.out.println("Not a positive Integer");
		}
		
		input.close();
		
	}
}
		
				
			
		