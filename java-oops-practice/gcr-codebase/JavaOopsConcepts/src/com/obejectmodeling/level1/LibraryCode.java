package com.obejectmodeling.level1;
import java.util.*;




public class LibraryCode {
	public static class Book{
		
		private String title;
		private String author;
		
		public Book(String title,String author) {
			this.title=title;
			this.author=author;
		}
		
		public String getTitle(){
			return title;
		}
		
		public String getAuthor() {
			return author;
		}
		
	}

	public static class Library{
		
		ArrayList<Book> books ;
		
		public Library(){
			books =new ArrayList<>();
		}
		
		public void addBook(Book book) {
			 books.add(book);
		}
		
		public void printAllBook() {
			for(Book book :books) {
				System.out.println("book name is :"+book.getTitle());
				System.out.println("book author name  is :"+book.getAuthor());
			}
		}

		
	}
   public static void main(String[] agrs) {
	  //Creating Independent class ==>>
	   Book book1 =new Book("Fling Wings","Abdul kalam");
	   Book book2 =new Book("Sprints","D.convey");
	   
	   //Creating Library ==>
        Library library1=new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        
        library1.printAllBook();
        
   }
}


