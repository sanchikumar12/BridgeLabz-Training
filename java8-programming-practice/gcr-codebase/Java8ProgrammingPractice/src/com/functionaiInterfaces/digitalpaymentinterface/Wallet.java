package com.functionaiInterfaces.digitalpaymentinterface;

public class Wallet implements DigitalPayment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Wallet");
	}

}
