package com.encapsulationandpolymorphism.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable{
	
	private boolean isAvailable = true;
	
	int getLoanDuration() {
		return 18;
	}
	Magazine(int itemId,String author, String title ){
		super(itemId,author , title );
	}

	public void reverseItem() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("magazine is return successfully.");
		}		
		else {
			System.out.println("magazine is already return.");
		}
	}

	public boolean checkAvailability() {
		return isAvailable;
	}
	
}
