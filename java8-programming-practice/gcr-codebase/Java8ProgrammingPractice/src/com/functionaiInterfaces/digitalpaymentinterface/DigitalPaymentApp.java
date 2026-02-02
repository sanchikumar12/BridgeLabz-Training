package com.functionaiInterfaces.digitalpaymentinterface;

public class DigitalPaymentApp {
	public static void main(String[] args) {
		
		DigitalPayment upi = new UPI();
		DigitalPayment creditCard = new CreditCard();
		DigitalPayment wallet = new Wallet();
		
		wallet.pay(233);
		creditCard.pay(3000);
		upi.pay(588);
	}
}
