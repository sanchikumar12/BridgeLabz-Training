import java.util.*;
public class SumOfNatural{

public static void  main(String [] agrs){
   Scanner sc =new Scanner(System.in);
   

   //Taking input==>
   System.out.println("Enter number :");
   int number =sc.nextInt();
   
   int result =number *(number+1) /2;
    
   
    if(number>=0){
      	System.out.println("The sum of "+number+" natural numbers is"+result );
    }else{
       System.out.println("The number "+ number+" is not a natural number");
     }
}

}