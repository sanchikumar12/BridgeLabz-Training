package com.oopspracticescenariobasedquestions.hospitalmanagement;



public class Bill implements Payable {
    private int billId;
    private double amount;
    private double tax;
    private double discount;

    public Bill(int billId, double amount, double tax, double discount) {
        this.billId = billId;
        this.amount = amount;
        this.tax = tax;
        this.discount = discount;
    }

    public double calculatePayment() {
        return amount + (amount * tax) - discount;
    }

    public void generateBill() {
        System.out.println("Total Bill Amount: " + calculatePayment());
    }
}

