package com.inheritance.levelone;

public class Intern extends Employee{
	String language;
	
    public Intern(String name,int id,int salary,String lang) {
    	super(name,id,salary);
    	this.language=lang;
    }
    
    
    @Override
    public void displaydetail() {
      System.out.println("Programming language is "+language);
    }
    
    
}
