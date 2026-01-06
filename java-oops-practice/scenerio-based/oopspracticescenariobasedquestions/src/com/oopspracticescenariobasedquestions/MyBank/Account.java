package com.oopspracticescenariobasedquestions.MyBank;



public class Account implements ITransaction{
  private int accountNumber;
  private int balance;
  
  public Account(int accno ,int bal) {
	  this.accountNumber=accno;
	  this.balance=bal;
  }
  
  public Account(String accountNumber2) {
	// TODO Auto-generated constructor stub
}

  public Account(String accountNumber2, double openingBalance) {
	// TODO Auto-generated constructor stub
}

  public void setAcoountNumber(int accno) {
	  this.accountNumber=accno;
  }
  
  public void setBalance(int balance){
	  this.balance=balance;
  }
  
  public int getAcountNumber() {
	  return accountNumber;
  }
  
  public int getBalance() {
	  return balance;
  }

  @Override
  public void deposite(int amount) {
	// TODO Auto-generated method stub
	
  }

  @Override
  public void withdraww(int withdraw) {
	// TODO Auto-generated method stub
	
  }

  @Override
  public void checkBalance() {
	// TODO Auto-generated method stub
	
  }

  public double calculateInterest() {
	// TODO Auto-generated method stub
	return 0;
  }


  
  
  
  
}
