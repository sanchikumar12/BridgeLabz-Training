// Program to check if a number is an Abundant Number

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        int number;

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take number as input from user
        System.out.println("Enter the number : ");
        number = input.nextInt();

        // Variable to store sum of proper divisors
        int sum = 0;

        // Loop from 1 to number - 1
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor of number
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        System.out.println(number + " " + (sum > number ? "is an Abundant Number" : "is not an Abundant Number"));

        // Close Scanner
        input.close();
    }
}
