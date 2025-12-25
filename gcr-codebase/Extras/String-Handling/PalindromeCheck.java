// Creating PalindromeCheck class for checking if a string is palindrome or not
import java.util.*;
public class PalindromeCheck{
     public static Boolean palindromeChecker(String str){
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
     }
     
     // Main method
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
        
          // Taking input from user
          String str = sc.nextLine();
     
          System.out.println(palindromeChecker(str));
     }
}