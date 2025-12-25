// Creating DateArithmetic class to solve
import java.util.*;
import java.time.*;
import java.time.format.DateTimeformatter;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user        
        System.out.print("Enter date (dd-mm-yyyy): ");
        String Date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        LocalDate date = LocalDate.parse(Date);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Displaying the output
        System.out.println("After adding 7 days, 1 month, 2 years: " + finalDate);
    }
}
