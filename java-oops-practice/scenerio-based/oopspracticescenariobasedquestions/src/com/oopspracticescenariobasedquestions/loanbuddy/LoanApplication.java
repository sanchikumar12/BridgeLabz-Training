package com.oopspracticescenariobasedquestions.loanbuddy;

abstract class LoanApplication implements IApprovable {
	 protected Applicant applicant;
	 protected String loanType;
	 protected int termInMonths;
	 protected double annualInterestRate;

	 private boolean approved;       
	 private boolean statusLocked;   

	 public LoanApplication(Applicant applicant, String loanType, int termInMonths, double annualInterestRate) {
	     this.applicant = applicant;
	     this.loanType = loanType;
	     this.termInMonths = termInMonths;
	     this.annualInterestRate = annualInterestRate;
	     approved = false;
	     statusLocked = false;
	 }

	
	 protected void setApproval(boolean status) {
	     if (!statusLocked) {
	         this.approved = status;
	         statusLocked = true;
	     }
	 }

	 public boolean isApproved() {
	     return approved;
	 }

	
	 @Override
	 public double calculateEMI() {
	     double P = applicant.getLoanAmount();
	     double R = (annualInterestRate / 12) / 100.0;
	     int N = termInMonths;

	     double numerator = P * R * Math.pow(1 + R, N);
	     double denominator = Math.pow(1 + R, N) - 1;

	     return denominator == 0 ? 0 : numerator / denominator;
	 }

	 @Override
	 public abstract boolean approveLoan();
	}


	class PersonalLoan extends LoanApplication {
	 public PersonalLoan(Applicant applicant, int term, double interest) {
	     super(applicant, "Personal", term, interest);
	 }

	 @Override
	 public boolean approveLoan() {
	     boolean result =
	             applicant.getCreditScore() >= 650 &&
	             applicant.getIncome() >= applicant.getLoanAmount() * 0.2;

	     setApproval(result);
	     return result;
	 }
	}
