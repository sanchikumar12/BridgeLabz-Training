package com.oopspracticescenariobasedquestions.ewalletapplication;

import java.util.ArrayList;

public abstract class Wallet implements Transferrable {
    private double balance; 
    protected ArrayList<Transaction> history = new ArrayList<>();

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected void deductBalance(double amount) {
        balance -= amount;
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}
