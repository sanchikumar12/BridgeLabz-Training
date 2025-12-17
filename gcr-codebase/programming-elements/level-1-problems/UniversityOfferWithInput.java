import java.util.*;

public class UniversityOfferWithInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the fee: ");
        int fee = sc.nextInt();
        
        System.out.print("Enter discount percentage: ");
        int discountPercent = sc.nextInt();

        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;

        
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);

        sc.close();
    }
}
