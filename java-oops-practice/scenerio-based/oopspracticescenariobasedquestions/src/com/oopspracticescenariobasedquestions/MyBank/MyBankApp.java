package com.mybank;

public class MyBankApp {

    public static void main(String[] args) {

        Account savings = new SavingsAccount("SAV123", 10000);
        Account current = new CurrentAccount("CAV456", 20000);
        savings.deposit(2000);
        current.withdraw(5000);
        
        System.out.println("Savings Balance: " + savings.checkBalance());
        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Current Balance: " + current.checkBalance());
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}

