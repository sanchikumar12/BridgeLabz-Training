// Program to find the factors of a number taken as user input.

import java.util.Scanner;
public class GreatestFactor2{
	public static void main(String[] args){
		int number;
	
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Using loop to find the factors of number
		System.out.println("Greatest Factor of " + number + " is " );
		int counter = number - 1;
		while( counter >= 1 ) {
		    if ( number % counter == 0 ){
				System.out.println( counter );
				break;
			}
			counter -- ;
		}
		
		
		input.close();
		
	}
}