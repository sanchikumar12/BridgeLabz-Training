package com.classandobject.level1;

public class BookDetail {
    String bookTitle;
    String bookAuthor;
    double price;
    
    BookDetail(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
    
    public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}


    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDetail bookdetail1 =new BookDetail("2States", "Chetan Bhagat", 500);
		BookDetail bookdetail2 =new BookDetail("Wings Of Fire","Abdul kalam.A.P.J",  500);
		bookdetail1.displayBookDetails();
		bookdetail2.displayBookDetails();
	}

}
