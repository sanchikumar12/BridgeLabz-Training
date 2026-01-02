package com.inheritance.levelone;

public class Cat extends AnimalHierarchy{

	public String name;
	public int age;
	
	public Cat(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public void displayName() {
		System.out.println("Dog name is :"+this.name);
	}
	
	@Override
	public void displayAge() {
		System.out.println("Dog age is :"+this.age);
	}


}
