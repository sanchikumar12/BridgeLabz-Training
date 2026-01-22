package ParcelTracker;

public class ParcelTracker {

    private ProductNode head;

    // Add a delivery stage
    public void addStage(int id, String name, String stage) {
        ProductNode newNode = new ProductNode(id, name, stage);

        if (head == null) {
            head = newNode;
            return;
        }

        ProductNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {
        ProductNode temp = head;

        while (temp != null) {
            if (temp.deliveryStage.equals(afterStage)) {
                ProductNode checkpoint =
                        new ProductNode(temp.productId, temp.productName, newStage);
                checkpoint.next = temp.next;
                temp.next = checkpoint;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found: " + afterStage);
    }

    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel missing.");
            return;
        }

        ProductNode temp = head;
        while (temp != null) {
            System.out.print(
                "[" + temp.productId + ", " +
                temp.productName + ", " +
                temp.deliveryStage + "]"
            );

            if (temp.next != null) {
                System.out.print(" → ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Handle lost parcel
    public void markLostAfter(String stage) {
        ProductNode temp = head;

        while (temp != null) {
            if (temp.deliveryStage.equals(stage)) {
                temp.next = null; // null pointer indicates lost parcel
                return;
            }
            temp = temp.next;
        }
    }
}
