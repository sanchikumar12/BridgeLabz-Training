import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stopNumber = 1;
        double distancePerStop = 2.5; 
        double totalDistance = 0;

        while (true) {
            System.out.println("Bus has reached stop #" + stopNumber);
            totalDistance += distancePerStop;

            System.out.print("Do you want to get off here? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("yes")) {
                System.out.println("You got off at stop #" + stopNumber);
                System.out.println("Total distance traveled: " + totalDistance + " km");
                break; 
            }

            stopNumber++;
        }

        sc.close();
    }
}
