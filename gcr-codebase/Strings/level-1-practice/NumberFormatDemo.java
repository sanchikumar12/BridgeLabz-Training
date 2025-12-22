import java.util.*;
public class NumberFormatDemo {

    // Method that generates NumberFormatException (no handling)
    public static void generateException() {
        String text = "ABC123";   // Not a valid number
        System.out.println("Attempting to parse: " + text);

        // This line will throw NumberFormatException
        int number = Integer.parseInt(text);

        System.out.println("Parsed number: " + number); // This won't execute
    }

    // Method that handles NumberFormatException using try–catch
    public static void handleException() {
        String text = "XYZ";   // Invalid number string
        System.out.println("Attempting to parse: " + text);

        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }

    public static void main(String[] args) {

        // FIRST: Call the method that generates the exception
        // (Program will stop here unless handled)
        try {
            generateException();
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------");

        // THEN: Call the method that handles the exception internally
        handleException();
    }
}
