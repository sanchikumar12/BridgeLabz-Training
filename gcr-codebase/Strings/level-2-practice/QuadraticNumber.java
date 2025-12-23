
import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        }
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Validate a  quadratic equation 
        if (a == 0) {
            System.out.println("Value of 'a' cannot be zero for a quadratic equation.");
            return;
        }

        double[] roots = findRoots(a, b, c);

        // Displaying output
        if (roots.length == 0) {
            System.out.println("No real roots (delta is negative).");
        } else if (roots.length == 1) {
            System.out.println("Only one root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
    }
}
