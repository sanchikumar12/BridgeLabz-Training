package com.obejectmodeling.level1;
import java.util.*;



public class BankAccountHolders {
	public static class BankAccount {
	    private int accountNumber;
	    private double balance;
	    private Bank bank;   

	    public BankAccount(int accountNumber, Bank bank) {
	        this.accountNumber = accountNumber;
	        this.bank = bank;
	        this.balance = 0.0;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }
	}




	public static class Customer {
	    private String name;
	    private List<BankAccount> accounts;  

	    public Customer(String name) {
	        this.name = name;
	        this.accounts = new ArrayList<>();
	    }

	    public void addAccount(BankAccount account) {
	        accounts.add(account);
	    }

	    
	    public void viewBalance() {
	        System.out.println("Balances for " + name + ":");
	        for (BankAccount acc : accounts) {
	            System.out.println("  Account Balance: " + acc.getBalance());
	        }
	    }
	}


	public static class Bank {
	    private String bankName;
	    private List<Customer> customers;   
	    public Bank(String bankName) {
	        this.bankName = bankName;
	        this.customers = new ArrayList<>();
	    }

	    public void addCustomer(Customer customer) {
	        customers.add(customer);
	    }

	   
	    public void openAccount(Customer customer, int accNumber) {
	        BankAccount newAccount = new BankAccount(accNumber, this);
	        customer.addAccount(newAccount);

	        System.out.println("Account " + accNumber +
	                " opened for " + customer + " at " + bankName);
	    }

	    public String getName() {
	        return bankName;
	    }
	}

    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer c1 = new Customer("John Doe");
        bank.addCustomer(c1);

        bank.openAccount(c1, 1001);   // Bank creates account for customer
        c1.viewBalance();             // Customer checks balance
    }
}
