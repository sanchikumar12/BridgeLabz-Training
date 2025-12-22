import java.util.*;
public class SubString{


public static void main(String [] agrs){

Scanner sc =new Scanner(System.in);


//Taking input ==>>
String text =sc.next();




//process ==>

String result1=SubString.getsubstring(text,0,4);
String result2=text.substring(0,4);

//Output ==>
System.out.println("Getting substring using UserDefine Method :"+ result1);
System.out.println("Getting substring using PreDefine Method :"+ result2);



}

public static String getsubstring(String s1 ,int start,int end){
 
  StringBuilder builder =new StringBuilder(); 
 if(start>s1.length()-1){
    return "Out of bound";
  }else if(end>s1.length()-1){
     return "Out of Bound";
   }else{
    
       for(int s=start;s<=end-1;s++){
            builder.append(s1.charAt(s));
         }
      
    }
    return builder.toString();

 


}

}