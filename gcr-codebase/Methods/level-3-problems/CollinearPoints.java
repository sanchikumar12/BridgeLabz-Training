import java.util.Scanner;

public class CollinearChecker {

    // Method to check collinearity using slope formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x2 - x1) == 0 && (x3 - x2) == 0) {
            return true; 
        } else if ((x2 - x1) == 0 || (x3 - x2) == 0) {
            return false; // only one vertical line
        }
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Using slope formula: " +(collinearSlope ? "Points are collinear" : "Points are NOT collinear"));
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Using area formula: " +
                (collinearArea ? "Points are collinear" : "Points are NOT collinear"));
    }
}
