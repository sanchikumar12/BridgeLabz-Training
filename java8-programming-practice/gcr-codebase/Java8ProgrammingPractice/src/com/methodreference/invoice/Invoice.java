package com.methodreference.invoice;

public class Invoice {

	int transactionId;
	public Invoice(int transactionId) {
		this.transactionId = transactionId;
	}
	
	@Override
	public String toString() {
		return "Invoice created for Transaction ID: " + transactionId;
	}
}