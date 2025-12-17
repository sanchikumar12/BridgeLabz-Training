import java.util.Scanner;

public class CalculateTotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Price of Iteam : ");
        double  unitprice = sc.nextDouble();

         System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();
        double total = unitprice*quantity;


       System.out.println(
    "The total purchase price is INR " + total +
    ", the quantity is " + quantity +
    ", and unit price is INR " + unitprice
);
       

        sc.close();
    }
}
