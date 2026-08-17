package Day12_Hackerrank;

class Book {

    String title;
    String author;
    int isBn;

    static int totalBooksInLibrary = 0;
    static int totalBooksCheckedOut = 0;

    Book(String title, String author, int isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
        totalBooksInLibrary++;
    }

    void checkOut() {
        totalBooksCheckedOut++;
    }

    void returnBook() {
        totalBooksCheckedOut--;
    }
}

public class Q1 {

    public static void main(String[] args) {

        Book b1 = new Book("Java", "James", 101);
        Book b2 = new Book("Python", "Guido", 102);
        Book b3 = new Book("C++", "Bjarne", 103);
        Book b4 = new Book("HTML", "Tim", 104);
        Book b5 = new Book("SQL", "Codd", 105);

        b1.checkOut();
        b2.checkOut();
        b3.checkOut();

        b1.returnBook();

        System.out.println("Total Books: " + Book.totalBooksInLibrary);
        System.out.println("Total Books Checked Out: " + Book.totalBooksCheckedOut);
    }
}