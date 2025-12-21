import java.util.*;
public class Factors{

public static void main(String[] agrs){
	
	Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();

         int count =0;
        for(int i=0;i<=number;i++)
         {
            if(number % i==0){
               count++; 
             }


        }

        int arr[] =new int[count];

        for(int j=0;j<=number;j++){
        
             if(number % i==0){
               arr[j]=i;
             }

           }


     	int sum = Factor.getSum(arr);
     	int product=Factor.getProduct(arr);
	System.out.println("The Sum is :"+sum);
	System.out.println("The Product is :"+sum);


             
        
        
      
       





}


public static int getSum(int [] nums){
  
     int sum=0;
      for(int a: nums){
         sum+=a;
         }
    return sum;

}


public static int getProduct(int [] nums){
  
     int product=1;
      for(int a: nums){
         product*=a;
         }
    return product;

}




} 