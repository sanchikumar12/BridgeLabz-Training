package com.oopspracticescenariobasedquestions.loanbuddy;

class AutoLoan extends LoanApplication {
	 public AutoLoan(Applicant applicant, int term, double interest) {
	     super(applicant, "Auto", term, interest);
	 }

	 @Override
	 public boolean approveLoan() {
	     boolean result =
	             applicant.getCreditScore() >= 630 &&
	             applicant.getIncome() >= applicant.getLoanAmount() * 0.18;

	     setApproval(result);
	     return result;
	 }
	}