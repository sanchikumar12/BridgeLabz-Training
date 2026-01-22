package ParcelTracker;

public class ProductNode {
    int productId;
    String productName;
    String deliveryStage;
    ProductNode next;

    public ProductNode(int productId, String productName, String deliveryStage) {
        this.productId = productId;
        this.productName = productName;
        this.deliveryStage = deliveryStage;
        this.next = null;
    }
}

