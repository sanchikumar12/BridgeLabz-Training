import java.util.Scanner;

public class SumOfNaturalTwo {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
   

   //Taking input==>
   System.out.println("Enter number :");
   int number =sc.nextInt();
   
   int formula =number *(number+1) /2;

     int a=number;
     int sum =0;
     
     while(a!=0){
       sum+=a;
       a--;
       }
    
   
          

        System.out.println("Total sum from formula is " + formula +"Total sum from While loop is "+ sum);
        sc.close();
    }
}
