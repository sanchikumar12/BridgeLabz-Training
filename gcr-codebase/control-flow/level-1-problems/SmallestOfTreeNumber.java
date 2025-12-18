import java.util.*;
public class SmallestOfTreeNumber{

public static void  main(String [] agrs){
   Scanner sc =new Scanner(System.in);
   

   //Taking input==>
   System.out.println("Enter number First:");
   int num1 =sc.nextInt();

   System.out.println("Enter number Second:");
   int num2 =sc.nextInt();

    System.out.println("Enter number Third:");
   int num3 =sc.nextInt();
   
    
   
    if(num1 <num2 && num1 <num3){
      	System.out.println( "Is the first number the smallest? Yes");
    }else{
       System.out.println(" Is the first number the smallest No");
     }
}

}