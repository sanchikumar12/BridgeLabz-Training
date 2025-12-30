import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);
        int finePerDay = 5;
        int totalFine = 0;
        System.out.println("Rohan's Library Fine Calculator: ");
        // loop for 5 books
        for (int book = 1; book <= 5; book++) {
            System.out.println("\nBook " + book + ":");
            System.out.print("Enter due date day: ");
            int dueDate = input.nextInt();
            System.out.print("Enter return date day: ");
            int returnDate = input.nextInt();
            // calculate fine
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine for this book: Rs. " + fine);
                totalFine += fine;
            } else {
                System.out.println("Returned on time. No fine");
            }
        }

        // display total fine
        System.out.println("\n----------------------------");
        System.out.println("Total Fine for all books: Rs. " + totalFine);
        System.out.println("----------------------------");

        input.close();
    }
}