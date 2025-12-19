// Program to create a calculator using switch-case

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        String operator;

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take first, second numberand operator as input
        System.out.println("Enter first number:");
        first = input.nextDouble();
        System.out.println("Enter second number:");
        second = input.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        operator = input.next();

        // Switch-case to perform calculation
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Operator is not valid");
        }

        input.close();
    }
}
