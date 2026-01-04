package com.linkedlist.doublylinkedlist.librarymanagement;

public class LibraryMain {
    public static void main(String[] args) {

        Library library = new Library();

        library.addAtEnd(1, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtEnd(2, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtBeginning(3, "The Alchemist", "Paulo Coelho", "Fiction", false);
        library.addAtPosition(2, 4, "1984", "George Orwell", "Dystopian", true);

        library.displayForward();
        library.displayReverse();

        library.searchByTitle("1984");
        library.searchByAuthor("Joshua Bloch");

        library.updateAvailability(3, true);

        library.removeById(2);

        library.countBooks();
        library.displayForward();
    }
}
