import java.util.*;
public class SimpleInterest
{


public static void main(String [] agrs){
 Scanner sc =new Scanner(System.in);
 
  System.out.println("Enter the Principle :");
  int principle =sc.nextInt();
  
  System.out.println("Enter the Rate :");
  int rate =sc.nextInt();



  System.out.println("Enter the Time :");
  int time=sc.nextInt();
  //call Methods==>
  int res =SimpleInterest.getsimpleInterest(principle,rate,time);

  System.out.println("“The Simple Interest is "+ res + "for Principal"+principle +" Rate of Interest "+rate );


  
  



}


public static int getsimpleInterest(int p ,int r,int t){

   int result=(p*r*t)/100;
   return result;


}




}