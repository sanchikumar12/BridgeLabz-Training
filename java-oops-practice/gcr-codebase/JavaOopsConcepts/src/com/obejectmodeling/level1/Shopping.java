import java.util.ArrayList;
import java.util.List;


public class Shopping {
	public static class Product {
	    private String name;
	    private double price;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() { return name; }
	    public double getPrice() { return price; }

	    @Override
	    public String toString() {
	        return name + " ($" + price + ")";
	    }
	}
	

public static class Order {
    private int orderId;
    private Customer customer;                 // Relationship: Order belongs to Customer
    private List<Product> productList;         // Aggregation: Order contains Products

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Product p : productList) {
            sum += p.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " for " + customer.getName() +
               "\nProducts: " + productList +
               "\nTotal: $" + calculateTotal();
    }
}


public static class Customer {
    private String name;
    private List<Order> orders;             

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() { return name; }

    public Order placeOrder(int orderId) {
        Order newOrder = new Order(orderId, this);
        orders.add(newOrder);
        return newOrder;
    }

    public void showOrderHistory() {
        if (orders.isEmpty()) {
            System.out.println(name + " has no orders yet.");
            return;
        }
        System.out.println("Order history for " + name + ":");
        for (Order o : orders) {
            System.out.println(o);
            System.out.println("-------------------");
        }
    }
}

    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 1200);
        Product mouse = new Product("Mouse", 25);
        Product keyboard = new Product("Keyboard", 45);

       
        Customer customer = new Customer("John Doe");

      
        Order order1 = customer.placeOrder(101);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = customer.placeOrder(102);
        order2.addProduct(keyboard);

      
        customer.showOrderHistory();
    }
}
