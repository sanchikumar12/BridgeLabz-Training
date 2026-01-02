package com.inheritance.levelone;

public class Bird extends AnimalHierarchy{
	public String name;
	public int age;
	
	public Bird(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public void displayName() {
		System.out.println("Bird name is :"+this.name);
	}
	
	@Override
	public void displayAge() {
		System.out.println("Bird age is :"+this.age);
	}



}
