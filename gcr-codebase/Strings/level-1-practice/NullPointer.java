import java.util.*;
public class NullPointer{


public static void main(String [] agrs){

Scanner sc =new Scanner(System.in);


//Taking input ==>>
String text =null;



//Output ==>
System.out.println("Generating Exception :");
 

 try{
  System.out.println(text.length());

}catch(Exception e){
   System.out.println("Exception Occured :");

}

System.out.println("Solving Exception  :");

NullPointer.solveException(text);

}

public static void  solveException(String s1){
 
    try{
       System.out.println(s1.length());
    }catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Reason: You tried to call a method on a null object.");
    }   

}

}