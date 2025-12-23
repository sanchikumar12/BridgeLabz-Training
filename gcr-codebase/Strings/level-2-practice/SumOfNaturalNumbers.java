import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        // Displaying the output
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula n*(n+1)/2: " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct and give the same result.");
        } else {
            System.out.println("The results do not match.");
        }
    }
}
