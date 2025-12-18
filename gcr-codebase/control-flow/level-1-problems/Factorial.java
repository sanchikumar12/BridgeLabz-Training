import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        
         int result=1;
         
        for(int a=number ; a>0; a--)
	{
           result=result*a;
  
	}

       

        // Output
        System.out.println("factorial is: " + result);
     

        sc.close();
    }
}
