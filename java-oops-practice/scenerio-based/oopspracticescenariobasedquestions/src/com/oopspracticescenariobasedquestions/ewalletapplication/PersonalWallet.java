package com.oopspracticescenariobasedquestions.ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(boolean referralUsed) {
        super(referralUsed ? 50 : 0); // referral bonus
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount <= getBalance() && amount <= 1000) {
            deductBalance(amount);
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Transfer", amount));
        } else {
            System.out.println("Transfer failed (limit or balance issue)");
        }
    }
}
