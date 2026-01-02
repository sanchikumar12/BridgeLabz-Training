package com.oopspracticescenariobasedquestions.ewalletapplication;



public class BusinessWallet extends Wallet {

    public BusinessWallet() {
        super(0);
    }

    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02; // 2% tax
        double total = amount + tax;

        if (total <= getBalance()) {
            deductBalance(total);
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Business Transfer", amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

