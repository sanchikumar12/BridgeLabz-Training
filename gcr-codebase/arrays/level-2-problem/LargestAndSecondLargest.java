import java.util.*;
public class LargestAndSecondLargest{

    public static void main(String[] agrs){
           Scanner sc =new Scanner(System.in);
          
        int n=10;
	int digits[] =new int[10];
           for(int a=0;a<n;a++){
 	    System.out.println("Enter The Digit "+(a+1));
              int digit =sc.nextInt();
 		digits[a]=digit;
           
          }
          int largest=Integer.MIN_VALUE;
          int secondlargest=Integer.MIN_VALUE;
         for(int j=0;j<digits.length;j++){
             if(digits[j]>largest){
              secondlargest=largest;
              largest=digits[j];
              
            } 
         }
  
           System.out.println("larget number is"+largest+"and second larget is "+secondlargest);

         }

}