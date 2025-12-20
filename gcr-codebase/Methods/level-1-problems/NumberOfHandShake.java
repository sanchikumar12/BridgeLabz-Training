import java.util.*;
public class NumberOfHandShake{


public static void main(String [] agrs){
 Scanner sc =new Scanner(System.in);
 
  System.out.println("Enter Number of students:");
  int students =sc.nextInt();
  

  int res =NumberOfHandShake.getCombination(students);

  System.out.println("“The Possible Number of handshake "+ res);


  
  



}


public static int getCombination(int nuberofstudents){
  
   int result = (nuberofstudents*(nuberofstudents-1))/2;
 
   return result;


}




}