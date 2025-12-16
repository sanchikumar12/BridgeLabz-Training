import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double timePeriod = scanner.nextDouble();

        double simpleInterest = (principalAmount * rateOfInterest * timePeriod) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}
