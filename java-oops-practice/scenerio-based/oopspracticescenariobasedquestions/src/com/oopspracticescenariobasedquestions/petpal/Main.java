package com.oopspracticescenariobasedquestions.petpal;


public class Main{
	
	public static void main(String [] agrs){
		
		  Pet pet = new Dog("Tuktuk", "Dog", 2);
	        pet.makeSound();  
	        pet.play();
	        pet.feed();

	        System.out.println("Mood: " + pet.getMood());
	        System.out.println("Energy: " + pet.getEnergy());
	}
	
	
}