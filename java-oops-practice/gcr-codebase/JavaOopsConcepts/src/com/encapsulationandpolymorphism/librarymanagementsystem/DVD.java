package com.encapsulationandpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
	
	private boolean isAvailable= true;
	int getLoanDuration() {
		return 29;
	}
	DVD(int itemId,String author, String title ){
		super(itemId,author , title );
	}
	public void reverseItem() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("DVD is return successfully.");
		}
		else {
			System.out.println("DVD is already return.");
		}
	}
	public boolean checkAvailability() {
		return isAvailable;
	}

}
