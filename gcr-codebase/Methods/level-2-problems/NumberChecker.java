import java.util.Scanner;

public class NumberChecker {

    public boolean isPositive(int num) {
        return num >= 0;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (checker.isPositive(numbers[i])) {
                if (checker.isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int result = checker.compare(numbers[0], numbers[4]);

        if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close();
    }
}
