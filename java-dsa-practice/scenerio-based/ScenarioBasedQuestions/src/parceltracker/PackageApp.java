package ParcelTracker;

public class PackageApp {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage(101, "Laptop", "Packed");
        tracker.addStage(101, "Laptop", "Shipped");
        tracker.addStage(101, "Laptop", "In Transit");
        tracker.addStage(101, "Laptop", "Delivered");

        System.out.println("Initial Delivery Tracking:");
        tracker.trackParcel();

        //tracker.addCheckpointAfter("Shipped", "Warehouse Scan");
        System.out.println("\nAfter Adding Checkpoint:");
        tracker.trackParcel();

        
        tracker.trackParcel();
    }
}
