package com.oopspracticescenariobasedquestions.groceryshoppingapp;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

	 private List<Product> items;
	 private double totalPrice; // Encapsulated!

	 // Default constructor
	 public Cart() {
	     items = new ArrayList<>();
	     totalPrice = 0;
	 }

	 // Constructor with pre-selected items
	 public Cart(List<Product> initialItems) {
	     this.items = new ArrayList<>(initialItems);
	     updateTotalPrice();
	 }

	 // Only Cart can update total price (ENCAPSULATION)
	 private void updateTotalPrice() {
	     totalPrice = 0;
	     for (Product p : items) {
	         totalPrice += p.getCost();
	     }
	 }

	 public void addProduct(Product p) {
	     items.add(p);
	     updateTotalPrice();
	 }

	 public void removeProduct(Product p) {
	     items.remove(p);
	     updateTotalPrice();
	 }

	 @Override
	 public double applyDiscount() {
	     double discountTotal = 0;

	     // Polymorphism: each product applies its own discount
	     for (Product p : items) {
	         discountTotal += p.getDiscount();
	     }

	     totalPrice = totalPrice - discountTotal;  // operator usage
	     return totalPrice;
	 }

	 @Override
	 public void generateBill() {
	     System.out.println("\n===== SwiftCart Bill =====");

	     for (Product p : items) {
	         System.out.println(
	             p.getName() + " | Qty: " + p.quantity +
	             " | Cost: " + p.getCost()
	         );
	     }

	     System.out.println("Total Before Discount: " + getTotalBeforeDiscount());
	     applyDiscount();
	     System.out.println("Total After Discount: " + totalPrice);
	     System.out.println("==========================\n");
	 }

	 // Only getter – no setter → protects price modification
	 public double getTotalBeforeDiscount() {
	     double temp = 0;
	     for (Product p : items) temp += p.getCost();
	     return temp;
	 }
	}