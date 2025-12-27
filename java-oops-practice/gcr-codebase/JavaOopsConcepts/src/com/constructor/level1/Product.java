package com.constructor.level1;
class Product {

    // Instance Variables
    private String productName;
    private double price;

    // Class Variable (shared by all objects)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        // Increment total number of products whenever a new object is created
        totalProducts++;
    }

    // Instance Method to display details of a product
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : $" + price);
        System.out.println();
    }

    // Class Method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}


// Driver Class
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 70000);
        Product p2 = new Product("Headphones", 2500);
        Product p3 = new Product("Keyboard", 1500);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Call class method
        Product.displayTotalProducts();
    }
}
