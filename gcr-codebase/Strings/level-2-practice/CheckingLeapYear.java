import java.util.*;
public class CheckingLeapYear{

      // Creating method to find the leap year
      public static void FindingLeapYear(int year){
            if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year should be 1582 or later.");
        }
      }
      public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
       
          // Taking input from user
          int year = sc.nextInt();
          
          FindingLeapYear(year);
          // System.out.println(FindingLeapYear(year));
      }
      
}