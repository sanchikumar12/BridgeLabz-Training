package com.linkedlist.doublylinkedlist.librarymanagement;

class Library {
    private Book head = null;

    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        Book newBook = new Book(id, title, author, genre, available);
        if (head != null) {
            newBook.next = head;
            head.prev = newBook;
        }
        head = newBook;
    }

    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        Book newBook = new Book(id, title, author, genre, available);

        if (head == null) {
            head = newBook;
            return;
            
        }

        Book temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newBook;
        newBook.prev = temp;
    }

    public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {
        if (position <= 1 || head == null) {
        	
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        Book newBook = new Book(id, title, author, genre, available);
        Book temp = head;
        int count = 1;

        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            
            count++;
        }

        newBook.next = temp.next;
        newBook.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newBook;
        }

        temp.next = newBook;
    }

    public void removeById(int id) {
        if (head == null) {
        	
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                // Removing head
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                        
                    }
                } else {
                    temp.prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }

                System.out.println("Book removed successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    public void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    public void updateAvailability(int id, boolean status) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability status updated.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;
        System.out.println("Books (Forward Order):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (head == null) {
            System.out.println("Library is empty.");
            
            return;
        }

        Book temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.println("Books (Reverse Order):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total books in library: " + count);
    }

    private void displayBook(Book book) {
        System.out.println(
            "ID: " + book.bookId +
            ", Title: " + book.title +
            ", Author: " + book.author +
            ", Genre: " + book.genre +
            ", Available: " + (book.isAvailable ? "Yes" : "No")
        );
    }
}

