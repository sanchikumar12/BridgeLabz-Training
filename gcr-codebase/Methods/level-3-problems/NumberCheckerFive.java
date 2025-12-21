import java.util.Scanner;

public class NumberCheckerFive {

    // Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
