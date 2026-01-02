package com.encapsulationandpolymorphism.librarymanagementsystem;

abstract class LibraryItem {
	private int itemId;
	private String title;
	private String author;

	abstract int getLoanDuration();
	public void getItemDetails() {
		System.out.println("The itemId is: "+itemId+"\nThe title is: "+
							title+"\nThe name of author is: "+author);
	}
	LibraryItem(int itemId , String title , String author){
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
}
