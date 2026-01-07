package com.oopspracticescenariobasedquestions.loanbuddy;

class HomeLoan extends LoanApplication {
	 public HomeLoan(Applicant applicant, int term, double interest) {
	     super(applicant, "Home", term, interest);
	 }

	 @Override
	 public double calculateEMI() {
	     // Home loans may have lower processing rate (polymorphism)
	     double adjustedRate = annualInterestRate * 0.95;
	     double P = applicant.getLoanAmount();
	     double R = (adjustedRate / 12) / 100.0;
	     int N = termInMonths;

	     double numerator = P * R * Math.pow(1 + R, N);
	     double denominator = Math.pow(1 + R, N) - 1;

	     return numerator / denominator;
	 }

	 @Override
	 public boolean approveLoan() {
	     boolean result =
	             applicant.getCreditScore() >= 600 &&
	             applicant.getIncome() >= applicant.getLoanAmount() * 0.15;

	     setApproval(result);
	     return result;
	 }
	}