package com.oopspracticescenariobasedquestions.groceryshoppingapp;

abstract class Product {
	 protected String name;
	 protected double price;    
	 protected String category;
	 protected int quantity;

	 public Product(String name, double price, String category, int quantity) {
	     this.name = name;
	     this.price = price;
	     this.category = category;
	     this.quantity = quantity;
	 }

	
	 public abstract double getDiscount();

	 public double getCost() {
	     return price * quantity;  
	 }

	 public String getName() {
	     return name;
	 }
	}
