import java.util.*;
public class ToUpperCase{


public static void main(String [] agrs){
  
//Taking Input ==>
Scanner sc =new Scanner(System.in);
String s=sc.nextLine();




//Procces ==>
String newstring =ToUpperCase.convertToUpperCase(s);

System.out.println("Converted to Upper case "+s+" to "+ newstring);
}

public static String  convertToUpperCase(String s){
    

    StringBuilder builder =new StringBuilder();
    for(char a: s.toCharArray()){
      
         int  asci =(int)a-32;
         char c=(char) asci;
         builder.append(c);
     }
  return builder.toString();

}






}