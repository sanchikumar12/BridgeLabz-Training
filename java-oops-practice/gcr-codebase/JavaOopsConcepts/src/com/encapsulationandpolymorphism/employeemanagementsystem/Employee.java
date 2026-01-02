package com.encapsulationandpolymorphism.employeemanagementsystem;

public abstract class Employee implements Department{
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;
	
	public void assignDepartment(String department) {
		this.department = department;
	}
	public String getDepartmentDetails() {
		return department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	abstract double calculateSalary();
	public void displayDetails() {
		System.out.println("Name: "+name+" EmployeeId: "+employeeId+" BaseSalary: "+calculateSalary()+" Department: "+department);
	}
	public Employee(int employeeId, String name, double baseSalary, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
}
