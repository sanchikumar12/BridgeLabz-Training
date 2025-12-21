import java.util.*;
public class GenerateNumber{


public static void main(String [] agrs){
Scanner sc=new Scanner(System.in);

 int[] arr =new int[4];

 for(int idx=0;idx<4;idx++){
     arr[idx]=GenerateNumber.getNumber();
  }

  int minValue=Integer.MAX_VALUE;
  int maxValue =Integer.MIN_VALUE;

  for(int a=0;a<4;a++){
      minValue=Math.min(minValue,arr[a]);
      maxValue=Math.max(maxValue,arr[a]);
   }
 System.out.println("Minimum is:" +minValue);
 System.out.println("Maximum is:" +maxValue);

}
 
public static int getNumber(){
   return (int)Math.random();
}













}