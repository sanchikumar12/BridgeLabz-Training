package com.oopspracticescenariobasedquestions.groceryshoppingapp;

public class PerishableProduct  extends Product {

	public PerishableProduct(String name, double price, String category, int quantity) {
		super(name, price, category, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscount() {
		
		return price*0.98;		
	}




}



