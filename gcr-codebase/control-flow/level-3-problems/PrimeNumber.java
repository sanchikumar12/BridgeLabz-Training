// Program to check if the given number is a prime number or not

import java.util.Scanner;
public class PrimeNumber{
	public static void main (String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		boolean isPrime = true;
		
		// if number is less then 1 then it is not a prime number
		if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
		
		// print whether the number is prime or not
		System.out.println( number + " " + ( isPrime ? "is a prime number" : "is not a prime number"));
		
		input.close();
	}
}
		