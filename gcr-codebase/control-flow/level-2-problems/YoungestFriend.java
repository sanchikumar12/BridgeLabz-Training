// Program to find the youngest friend

import java.util.Scanner;
public class YoungestFriend{
	public static void main(String[] args){
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Taking age of three friends as input
		System.out.println("Enter age of Amar : ");
		int ageOfAmar = input.nextInt();
		System.out.println("Enter age of Akbar : ");
		int ageOfAkbar = input.nextInt();
		System.out.println("Enter age of Anthony : ");
		int ageOfAnthony = input.nextInt();
		
		// Taking height of three friends as input
		System.out.println("Enter height of Amar : ");
		int heightOfAmar = input.nextInt();
		System.out.println("Enter height of Akbar : ");
		int heightOfAkbar = input.nextInt();
		System.out.println("Enter height of Anthony : ");
		int heightOfAnthony = input.nextInt();
		
		// Use If statement to find the smallest of the 3 ages
		if ( ageOfAmar < ageOfAkbar && ageOfAmar < ageOfAnthony){
			System.out.println("Amar is youngest");
		} else if ( ageOfAkbar < ageOfAmar && ageOfAkbar < ageOfAnthony){
			System.out.println("Akbar is youngest");
		} else {
			System.out.println("Anthony is youngest");
		}
		
		// Use If statement to find the Largest of the 3 height
		if ( heightOfAmar > heightOfAkbar && heightOfAmar > heightOfAnthony){
			System.out.println("Amar is Tallest");
		} else if ( heightOfAkbar < heightOfAmar && heightOfAkbar < heightOfAnthony){
			System.out.println("Akbar is Tallest");
		} else {
			System.out.println("Anthony is Tallest");
		}
		
		// closing the Scanner
		input.close();
		
	}
}
		
		
		
