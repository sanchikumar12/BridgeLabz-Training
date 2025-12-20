import java.util.*;

public class SmallerAndGreater{

public static void main(String [] agrs){
 
 Scanner sc =new Scanner(System.in);
 int n =3;
 int arr[] =new int[3];

for(int a=0;a<3;a++){
 System.out.println("Enter the "+(a+1)+"Number :");
  arr[a]=sc.nextInt();

}

System.out.println("The smallest is:"+SmallerAndGreater.getSmallest(arr));
System.out.println("The largest is:"+SmallerAndGreater.getLargest(arr));

 



}

public static int getSmallest(int[] arr){

  int small=Integer.MAX_VALUE;

  for(int i=0;i<3;i++){
     small=Math.min(small,arr[i]);
   }

  return small;

}

public static int getLargest(int[] arr){

  int large=Integer.MIN_VALUE;

  for(int i=0;i< 3;i++){
     large=Math.max(large,arr[i]);
   }

  return large;

}





}