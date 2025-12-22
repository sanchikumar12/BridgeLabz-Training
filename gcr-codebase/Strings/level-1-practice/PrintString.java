import java.util.*;
public class PrintString{


public static void main(String [] agrs){

Scanner sc =new Scanner(System.in);


//Taking input ==>>
String text =sc.next();



//Output ==>
System.out.println("Getting substring using  Custom Method :");
PrintString.printstring(text);

System.out.println("Getting substring Using toCharArray Method :");

for(char a:text.toCharArray()){
 System.out.println(a);
}



}

public static void printstring(String s1){
 
  for(int idx =0;idx<s1.length();idx++){
    System.out.println(s1.charAt(idx));
  }
}

}