
import java.util.*;
public class Recursion
{


   public static void main(String [] agrs){
     Scanner sc =new Scanner(System.in);
     int input =sc.nextInt();

     int answer =Recursion.getSum(input,1,0);
    
     int formula = (input*(input+1))/2;
     int res=getSum(input,1,0);
     System.out.print(formula +" "+res);
     

   }

 public static int getSum(int n,int start,int sum ){
       if(start == n+1){
            return sum;
          }
          sum+=start;
          return getSum(n,start+1,sum);
   }



}