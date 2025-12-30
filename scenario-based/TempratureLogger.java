import java.util.*;
public class TempratureLogger{

public static void main(String[] agrs){
Scanner sc =new Scanner(System.in);

System.out.println("Enter The Days :");
int days=sc.nextInt();
int [] temperature =new int[days];

for(int i=0;i<days;i++){
  System.out.println("Enter The Temprature for day:" +(i+1));
  temperature[i]=sc.nextInt();
}

double average =0.0;
int max=Integer.MIN_VALUE;
int sum=0;

for(int temp:temperature){
   sum+=temp;
   max= Math.max(max,temp);
}

average=sum/days;

System.out.println("The Average temprature is :" +average+ " :maximum temprature is :"+max );








}



}