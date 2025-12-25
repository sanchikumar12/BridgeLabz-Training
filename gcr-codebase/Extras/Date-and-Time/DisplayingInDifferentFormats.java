// Creating DisplayingInDifferentFormats class to get the time of different zones
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DisplayingInDifferentFormats{
     public static void main(String [] args){


          // Getting local time with built-in methods
          LocalDateTime now = LocalDateTime.now();
          String pattern1 = "dd/MM/yyyy";
          String pattern2 = "yyyy-MM-dd";
          String pattern3 = "EEE, MMM dd, yyyy";

          DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(pattern1);
          DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
          DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern(pattern3);

          String formattedDateTime1 = now.format(formatter1);
          String formattedDateTime2 = now.format(formatter2);
          String formattedDateTime3 = now.format(formatter3);


          // Displaying the output
          System.out.println(formattedDateTime1);
          System.out.println(formattedDateTime2);          
          System.out.println(formattedDateTime3);
     }
}