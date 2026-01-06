package com.mybank;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0; 

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
