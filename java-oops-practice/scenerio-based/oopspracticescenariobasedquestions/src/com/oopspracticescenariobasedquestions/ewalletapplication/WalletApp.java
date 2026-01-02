package com.oopspracticescenariobasedquestions.ewalletapplication;

public class WalletApp {
    public static void main(String[] args) {
        User alice = new User("Alice", new PersonalWallet(true));
        User bob = new User("Bob", new BusinessWallet());

        alice.getWallet().transferTo(bob, 200);

        System.out.println("Alice Balance: " + alice.getWallet().getBalance());
        System.out.println("Bob Balance: " + bob.getWallet().getBalance());
    }
}
