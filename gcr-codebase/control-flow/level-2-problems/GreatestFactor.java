// Program to find the factors of a number taken as user input.

import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[] args){
		int number;
	
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Using loop to find the factors of number
		System.out.println("Greatest Factor of " + number + " is " );
		for(int i = number - 1 ; i >= 0 ; i--){
		    if ( number % i == 0 ){
				System.out.println( i );
				break;
			}
		}
		
		
		input.close();
		
	}
}