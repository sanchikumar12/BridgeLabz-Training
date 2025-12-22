import java.util.*;
public class TwoStringIsEqual{


public static void main(String [] agrs){

Scanner sc =new Scanner(System.in);


//Taking input ==>>
String string1 =sc.next();

String string2 =sc.next();




//process ==>
boolean isequal=TwoStringIsEqual.isEqual(string1,string2);

boolean isequal2 =string1.equals(string2);


//Output ==>
System.out.println("Equal using charAt Method "+ isequal);
System.out.println("Equal using Equals Method "+ isequal2);






}

public static boolean isEqual(String s1,String s2){
 
 
     if(s1.length() != s2.length()){
       return false;
     }
    
    for(int idx =0;idx<s1.length();idx++){
      if(s1.charAt(idx)!=s2.charAt(idx)){
          return false;
      }
   }

  return true;

}

}