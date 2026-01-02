package com.inheritance.levelone;

public class Manager extends Employee {
      int teamsize;
	 public Manager(String name,int id,int salary,int teamsize) {
		 super(name,id,salary);
		 this.teamsize=teamsize;
	     super.displaydetail();
		 
	 }
	 
	 @Override
	 public void displaydetail() {
		 System.out.println("Team size is"+this.teamsize);
	 }

	
	

}
