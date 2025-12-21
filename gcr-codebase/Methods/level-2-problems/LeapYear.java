import java.util.*;
public class LeapYear{


public static void main(Strings[] agrs){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Year");
int year =sc.nextInt();


if(year<1582){
 System.out.println("Invalid Input"); 
 break;
}


  boolean ans =LeapYear.IsLeapYear(year);
  System.out.println("Is LeapYear "+ans);



}

public static boolean IsLeapYear(int year){
    
     if(year%100==0 || year%400){
      return false;
      }else if(year%4==0 ){
       return true;
       }
       return false;
}

}