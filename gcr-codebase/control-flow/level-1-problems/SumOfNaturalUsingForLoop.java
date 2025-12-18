import java.util.Scanner;

public class SumOfNaturalUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Using formula
        int formulaSum = number * (number + 1) / 2;

        // Using while loop
        int a = number;
        int loopSum = 0;

         for(int b =a;a>0;a--){
              loopSum += b; 
          }

      

        // Output
        System.out.println("Total sum using formula is: " + formulaSum);
        System.out.println("Total sum using while loop is: " + loopSum);

        sc.close();
    }
}
