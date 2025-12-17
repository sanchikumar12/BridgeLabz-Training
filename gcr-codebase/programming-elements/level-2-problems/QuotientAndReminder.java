import java.util.Scanner;

public class  QuotientAndReminder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter First Number : ");
        int  first = sc.nextInt();

         System.out.print("Enter Second Number : ");
        int second = sc.nextInt();

        double quotient = first/second;
        double reminder = first%second;


       System.out.println(
 "The Quotient is"+quotient +" and Reminder is"+ reminder + "of two number"+ first+" and"+ second

);
       

        sc.close();
    }
}
