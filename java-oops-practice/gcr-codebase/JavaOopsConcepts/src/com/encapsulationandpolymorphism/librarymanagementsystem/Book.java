package com.encapsulationandpolymorphism.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
	
	private boolean isAvailable = true;
	int getLoanDuration() {
		//books can be borrowed for 14 days
		return 14;
	}
	Book( int itemId,String author, String title){
		super(itemId,author , title );
	}
	public void reverseItem() {
		if(isAvailable) {
				isAvailable = false;
				System.out.println("Book return successfully.");
		}else {
			System.out.println("Book already reverse.");
		}
	}
	public boolean checkAvailability() {
		return isAvailable;
	}
}
