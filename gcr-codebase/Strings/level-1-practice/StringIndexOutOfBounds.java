import java.util.*;
public class  StringIndexOutOfBounds{


public static void main(String [] agrs){

Scanner sc =new Scanner(System.in);


//Taking input ==>>
String text =sc.next();



//Output ==>
System.out.println("Generating Exception :");
 

 try{
  System.out.println(text.charAt(text.length()+3));

}catch(Exception e){
   System.out.println("Exception Occured :");

}

System.out.println("Solving Exception  :");

StringIndexOutOfBounds.solveException(text);

}

public static void  solveException(String s1){
 
    try{
       System.out.println(text.charAt(text.length()+3));
    }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Reason: You tried to call a method on a null object.");
    }   

}

}