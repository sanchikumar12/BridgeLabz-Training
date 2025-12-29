import java.util.*;

interface ParkingServices {

    boolean park();
    int getOccupancy();
    boolean exitParking();
}

class Parking {
    final int maxOccupancy;
    int occupied;

    public Parking(int totalParking) {
        this.maxOccupancy = totalParking;
        this.occupied = 0;
    }

    public boolean park() {
        if (occupied < maxOccupancy) {
            occupied++;
            return true;
        }
        return false;
    }

    public int getOccupancy() {
        return occupied;
    }

    public boolean exitParking() {
        if (occupied > 0) {
            occupied--;
            return true;
        }
        return false;
    }
}

class ParkingService implements ParkingServices {

    Parking parking;

    public ParkingService(int capacity) {
        parking = new Parking(capacity);
    }

    @Override
    public boolean park() {
        return parking.park();
    }

    @Override
    public int getOccupancy() {
        return parking.getOccupancy();
    }

    @Override
    public boolean exitParking() {
        return parking.exitParking();
    }
}

public class Parkingg{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total parking slots: ");
        int slots = sc.nextInt();

        ParkingService parkingService = new ParkingService(slots);

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (parkingService.park()) {
                        System.out.println("Vehicle parked successfully!");
                    } else {
                        System.out.println("Parking Lot Full!");
                    }
                    break;

                case 2:
                    if (parkingService.exitParking()) {
                        System.out.println("Vehicle exited successfully!");
                    } else {
                        System.out.println("No vehicles to exit!");
                    }
                    break;

                case 3:
                    System.out.println("Current Occupied: " + parkingService.getOccupancy());
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
