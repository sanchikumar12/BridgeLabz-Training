import java.util.Scanner;

public class PointLineCalculator {

    // Method to calculate Euclidean distance between two points
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and y-intercept of the line passing through two points
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m; // slope
        double b; // y-intercept

        if (x2 - x1 == 0) {
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN;
        } else {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        }

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter x1 and y1 for the first point: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2 for the second point: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.4f\n", distance);
        double[] line = lineEquation(x1, y1, x2, y2);

        if (Double.isInfinite(line[0])) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.4f * x + %.4f\n", line[0], line[1]);
        }
    }
}
