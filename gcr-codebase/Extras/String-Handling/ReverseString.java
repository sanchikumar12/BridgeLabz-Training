// Creating ReverseString class to reverse the string
import java.util.*;
public class ReverseString{

     // Method to reverse the string
     public static String stringReversal(String str){
          String reversedstr = "";
          for(int i = str.length() - 1; i >= 0; i--){
              reversedstr += str.charAt(i);
          }
          return reversedstr;
     }
     
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);

          // Taking input from user
          String str = sc.nextLine();

          System.out.println("Reverse String : " + stringReversal(str));
     }
}