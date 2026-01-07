package com.oopspracticescenariobasedquestions.loanbuddy;

public class LoanBuddyDemo {
 public static void main(String[] args) {
     Applicant a = new Applicant("John Doe", 700, 80000, 25000);

     LoanApplication loan = new PersonalLoan(a, 36, 14.5);

     System.out.println("Applicant: " + a.getName());
     System.out.println("Loan Type: " + loan.loanType);

     boolean approved = loan.approveLoan();
     System.out.println("Loan Approved: " + approved);

     System.out.printf("Monthly EMI: %.2f%n", loan.calculateEMI());
 }
}
