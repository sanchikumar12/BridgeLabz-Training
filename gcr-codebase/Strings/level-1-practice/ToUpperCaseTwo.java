import java.util.*;
public class ToUpperCaseTwo{


public static void main(String [] agrs){
  
//Taking Input ==>
Scanner sc =new Scanner(System.in);
String s=sc.nextLine();




//Procces ==>
String newstring =ToUpperCaseTwo.convertToUpperCase(s);
String buildfunction=s.toUpperCase();

System.out.println("Converted to Upper case "+s+" to "+ newstring);
System.out.println("Converted by InBuild Fuction "+s+" to "+buildfunction );

if(newstring.equals(buildfunction)){
  System.out.println("Both are equals");

}else{
  
 System.out.println("Both are not  equals");
}

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