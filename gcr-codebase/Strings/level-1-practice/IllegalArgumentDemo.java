import java.util.*;

public class IllegalArgumentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // 1. First call the method that generates the exception (unhandled)
        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch (Exception e) {
            // Catching to prevent program crash so next part continues
            System.out.println("Exception occurred in generateException(): " + e);
        }

        // 2. Now call the method that handles the exception using try-catch
        System.out.println("\nHandling Exception:");
        handleException(text);
    }

    // Method that generates IllegalArgumentException (NO try-catch)
    public static void generateException(String s) {
        // start index > end index => IllegalArgumentException
        System.out.println(s.substring(5, 2));  
    }

    // Method that handles it properly using try-catch
    public static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));  // same incorrect usage
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
            System.out.println("Reason: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            // generic runtime exception handling
            System.out.println("Caught a RuntimeException: " + e);
        }
    }
}
