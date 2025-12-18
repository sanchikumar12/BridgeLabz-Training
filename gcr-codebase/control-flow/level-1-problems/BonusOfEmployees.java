import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

       // Take integer input
        System.out.print("Enter year of Salary: ");
        int salary= sc.nextInt();

        // Take integer input
        System.out.print("Enter year of Service: ");
        int service= sc.nextInt();


        double res= (salary*5/100);
         System.out.print("Print the bonus amount :" +res);

        
       
       


         

       


    }
}
