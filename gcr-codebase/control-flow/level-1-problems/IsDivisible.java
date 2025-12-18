import java.util.*;
public class IsDivisible{

public static void  main(String [] agrs){
   Scanner sc =new Scanner(System.in);
   

   //Taking input==>
   System.out.println("Enter number :");
   int number =sc.nextInt();
   
    
   
    if(number%5==0){
      	System.out.println("Is the number "+ number +"divisible by 5? Yes");
    }else{
       System.out.println("Is the number "+ number +"divisible by 5? No");
     }
}

}