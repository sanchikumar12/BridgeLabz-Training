package com.encapsulationandpolymorphism.employeemanagementsystem;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e1 = new FullTimeEmployee(1, "Amit", 50000, "IT");
		Employee e2 = new PartTimeEmployee(2, "Ravi", 0, "HR", 20, 500);
		e1.displayDetails();
		e2.displayDetails();
	}
}
