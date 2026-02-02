package com.functionaiInterfaces.digitalpaymentinterface;

public class CreditCard implements DigitalPayment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card");
	}
}
