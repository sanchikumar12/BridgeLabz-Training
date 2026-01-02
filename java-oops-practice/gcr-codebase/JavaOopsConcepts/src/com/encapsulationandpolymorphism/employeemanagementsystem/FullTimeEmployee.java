package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(int employeeId, String name, double baseSalary, String department) {
		super(employeeId, name, baseSalary, department);
	}
	double calculateSalary() {
		return getBaseSalary();
	}
}
