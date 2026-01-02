package com.encapsulationandpolymorphism.employeemanagementsystem;

public class PartTimeEmployee extends Employee {
	public PartTimeEmployee(int employeeId, String name, double baseSalary, String department , int hourWorked, double hourlyRate) {
		super(employeeId, name, baseSalary, department);
		this.hourWorked = hourWorked;
		this.hourlyRate = hourlyRate;
	}
	private int hourWorked;
	private double hourlyRate;
	
	double calculateSalary() {
		return hourWorked*hourlyRate;
	}
	
}
