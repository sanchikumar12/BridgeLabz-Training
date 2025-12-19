
import java.util.*;
public class Voating{

public static void main(String [] agrs){

Scanner sc = new Scanner(System.in);

int ages[] = new int[11];

for(int a= 0;a<=10;a++){
  int c=a+1;
  System.out.println("Enter "+a+" age :");
 int age=sc.nextInt();
 ages[a]=age;
}

for(int aa:ages){
 
 if(aa>=18){
    System.out.println("The student with the age"+ aa+" can vote.");
  }else{
    System.out.println("The student with the age"+ aa+" can not vote.");
   }

}



}





}