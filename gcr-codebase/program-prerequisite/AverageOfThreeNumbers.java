import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter second number");
        double secondNumber = sc.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = sc.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average = " + average);

        sc.close();
    }
}
