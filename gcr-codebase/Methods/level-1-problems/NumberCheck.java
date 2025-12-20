import java.util.*;
public class NumberCheck{


public static void main(String [] agrs){
 Scanner sc =new Scanner(System.in);
 
  System.out.println("Enter Number Please:");
  int number =sc.nextInt();

  int result = NumberCheck.getValue(number);
  System.out.println("The result is : "+ result);
  
    


  
  



}


public static int getValue(int num ){
  
 if(num<0){
  return -1;
 }else if(num>0){
   return 1; 
 }
 
   return 0;


}




}