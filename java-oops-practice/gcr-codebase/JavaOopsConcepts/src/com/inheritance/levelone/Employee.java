package com.inheritance.levelone;

public class Employee {
  public String name;
  public int id;
  public int salary;
  
  public Employee(String name,int id,int salary) {
	  this.name=name;
	  this.id=id;
	  this.salary=salary;
  }
  
  
  public void displaydetail() {
	   
	  System.out.println("Name is "+name);
	  System.out.println("Id  is "+id);
	  System.out.println("Salary is "+salary);
  }
  
	

	public static void main(String[] args) {
		Manager manager =new Manager("Sanchit",56789,10000,30);
		manager.displaydetail();
		
		Developer dev =new Developer("Keshav",4556,10000);
		dev.displaydetail();
		
		Intern intern =new Intern("Keshav",4556,10000,"Java");
		intern.displaydetail();
	}

}
