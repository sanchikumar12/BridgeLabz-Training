
// Parent Class
package com.constructor.level1;
class BankAccount {

    public String accountNumber;     // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for private balance
    public double getBalance() {
        return balance;
    }

    // Setter to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println();
    }
}


// Subclass demonstrating protected & public member access
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        // Accessing public (accountNumber) and protected (accountHolder)
        System.out.println("Savings Account Number : " + accountNumber);
        System.out.println("Account Holder          : " + accountHolder);
        System.out.println("Balance                 : ₹" + getBalance());
        System.out.println("Interest Rate           : " + interestRate + "%");
        System.out.println();
    }
}


// Driver Class
public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("ACC12345", "Rohan Singh", 15000);
        acc1.displayAccountDetails();

        // Modify balance using setter
        acc1.setBalance(18000);
        System.out.println("Updated Balance: ₹" + acc1.getBalance());
        System.out.println();

        // Subclass object
        SavingsAccount sav1 = new SavingsAccount("SAV99887", "Anita Desai", 25000, 4.5);
        sav1.displaySavingsDetails();
    }
}
