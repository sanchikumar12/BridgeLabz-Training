import java.util.*;

public class NaturalNumber{

public static void main(String [] agrs){
 
 Scanner sc =new Scanner(System.in);
 int number  =sc.nextInt();

   int result =NaturalNumber.getSum(number);
   
   System.out.println("The result is: "+result);


}

public static int getSum(int number){

  int sum=0;

  for(int a=1;a<=number;a++){
     sum+=a;
   }

  return sum;

}




}