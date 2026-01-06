package com.oopspracticescenariobasedquestions.groceryshoppingapp;

class NonPerishableProduct extends Product {

	 public NonPerishableProduct(String name, double price, String category, int quantity) {
	     super(name, price, category, quantity);
	 }

	 @Override
	 public double getDiscount() {
	     // Lower discount
	     return getCost() * 0.03;  // 3% discount
	 }
	}
