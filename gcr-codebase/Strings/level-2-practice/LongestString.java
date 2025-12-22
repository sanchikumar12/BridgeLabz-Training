import java.util.*;
public class LongestString{

public static void main(String [] agrs){
Scanner sc =new Scanner(System.in);

String s= sc.nextLine();

String [] texts =s.split("\\s+");

int longest =Integer.MIN_VALUE;
int shortest= Integer.MAX_VALUE;

String smallest ="";
String largest =" ";

for(String a: texts){
   longest= Math.max(longest,a.length());
   largest=a;
}

for(String b: texts){
   shortest= Math.min( shortest,b.length());
   smallest=b;
}

System.out.println("longest String is :" +largest );
System.out.println("Shortest String is :" +smallest);



}



}