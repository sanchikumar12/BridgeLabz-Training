import java.util.*;
public class AttendanceSystem{


public static void main(String[] agrs){
 Scanner sc =new Scanner(System.in);
 int n=sc.nextInt();
 String[] names=new String[n];
 
 for(int i=0;i<names.length;i++){
    System.out.println("Enter student name "+(i+1)); 
    String s= sc.next();
 }

 boolean [] attendance =new boolean[names.length];

 for(int j=0;j<attendance.length;i++){
    attendance[j]=sc.nextBoolean();
 }

 
 for(int j=0;j<attendance.length;j++){
     String name =names[j];
     if(attendance[j]==true){
      System.out.println(name+ "is present");
      }else{
          System.out.println(name+ "is absent");
      }
     
 }

}






}