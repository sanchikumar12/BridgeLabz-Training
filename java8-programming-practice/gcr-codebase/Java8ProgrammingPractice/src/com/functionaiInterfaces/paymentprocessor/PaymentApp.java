package com.functionaiInterfaces.paymentprocessor;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPaymentProcessor();
        PaymentProcessor card = new CreditCardPaymentProcessor();

        upi.processPayment(500);
        upi.refund(200); 

        card.processPayment(1000);
        card.refund(300); 
    }
}

