// Program to find the multiplication table of a number entered by the user from 6 to 9.

import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Using a for loop, find the multiplication table of number from 6 to 9
		for(int i = 6; i <= 9 ; i++){
			System.out.println(number + " * " + i + " = " + (number * i));
		}
		
		input.close();
		
	}
}
		