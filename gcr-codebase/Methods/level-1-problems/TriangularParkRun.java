import java.util.Scanner;

public class TriangularParkRun {

    // Method to compute number of rounds needed
    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();

        // Compute number of rounds
        double rounds = computeRounds(a, b, c);

        System.out.printf("The athlete must complete %.2f rounds to finish a 5 km run.\n", rounds);
        
        sc.close();
    }
}
