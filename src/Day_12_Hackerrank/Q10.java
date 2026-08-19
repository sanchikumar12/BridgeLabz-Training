package Day_12_Hackerrank;

enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean isFinal() {
        return this == DELIVERED || this == CANCELLED;
    }
}

class Order {
    private String orderId;
    private OrderStatus status;

    public Order(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.PLACED;
    }

    public void updateStatus(OrderStatus newStatus) {
        if (this.status.isFinal()) {
            System.out.println("[ERROR] Order " + orderId + " is already in final state (" + status + "). Cannot change to " + newStatus);
            return;
        }
        this.status = newStatus;
        System.out.println("Order " + orderId + " status updated -> " + status + " (isFinal: " + status.isFinal() + ")");
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }
}

public class Q10 {
    public static void main(String[] args) {
        System.out.println("=== Order Status Simulation ===");

        System.out.println("--- Order 101 Flow ---");
        Order order1 = new Order("ORD-101");
        System.out.println("Created: " + order1.getOrderId() + " -> Status: " + order1.getStatus() + " (isFinal: " + order1.getStatus().isFinal() + ")");

        order1.updateStatus(OrderStatus.SHIPPED);
        order1.updateStatus(OrderStatus.DELIVERED);
        order1.updateStatus(OrderStatus.CANCELLED);

        System.out.println("\n--- Order 102 Flow ---");
        Order order2 = new Order("ORD-102");
        System.out.println("Created: " + order2.getOrderId() + " -> Status: " + order2.getStatus() + " (isFinal: " + order2.getStatus().isFinal() + ")");

        order2.updateStatus(OrderStatus.CANCELLED);
        order2.updateStatus(OrderStatus.SHIPPED);
    }
}
