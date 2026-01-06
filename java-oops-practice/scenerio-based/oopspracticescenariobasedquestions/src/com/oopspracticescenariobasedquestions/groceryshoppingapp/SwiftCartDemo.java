package com.oopspracticescenariobasedquestions.groceryshoppingapp;

import java.util.*;
public class SwiftCartDemo {

 public static void main(String[] args) {

     // Create products
     Product milk = new PerishableProduct("Milk", 50, "Dairy", 2);
     Product bread = new PerishableProduct("Bread", 40, "Bakery", 1);
     Product rice = new NonPerishableProduct("Rice", 70, "Grains", 3);

     // Create cart with initial items
     List<Product> initial = Arrays.asList(milk, bread);
     Cart cart = new Cart(initial);

     // Add more products
     cart.addProduct(rice);

     // Generate bill
     cart.generateBill();
 }
}
