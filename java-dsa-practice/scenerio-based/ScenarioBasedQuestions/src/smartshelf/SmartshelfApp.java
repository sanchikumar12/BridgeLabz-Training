package SmartShelf;

import java.util.ArrayList;
import java.util.List;

public class SmartshelfApp {

    public static void insertBook(List<String> shelf, String newBook) {
        shelf.add(newBook);
        int i = shelf.size() - 1;

        while (i > 0 && shelf.get(i).compareToIgnoreCase(shelf.get(i - 1)) < 0) {
            String temp = shelf.get(i);
            shelf.set(i, shelf.get(i - 1));
            shelf.set(i - 1, temp);
            i--;
        }
    }

    public static void main(String[] args) {
        List<String> bookShelf = new ArrayList<>();

        insertBook(bookShelf, "Data Structures");
        insertBook(bookShelf, "Algorithms");
        insertBook(bookShelf, "Computer Networks");
        insertBook(bookShelf, "Artificial Intelligence");
        insertBook(bookShelf, "Operating Systems");

        System.out.println("SmartShelf – Alphabetically Arranged Books:");
        for (String book : bookShelf) {
            System.out.println(book);
        }
    }
}
