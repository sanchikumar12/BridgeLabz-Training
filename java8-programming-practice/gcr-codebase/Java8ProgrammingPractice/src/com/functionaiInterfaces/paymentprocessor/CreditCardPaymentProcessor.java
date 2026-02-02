package com.functionaiInterfaces.paymentprocessor;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed to Credit Card");
    }
}
