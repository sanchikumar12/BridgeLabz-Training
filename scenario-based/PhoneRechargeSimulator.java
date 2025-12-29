import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0.0;  
        boolean running = true;

        System.out.println("PHONE RECHARGE");

        while (running) {
            System.out.println("\nEnter Mobile Operator : ");
            String operator = sc.next().toLowerCase();

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

                        System.out.println("Offers Available");
            switch (operator) {
                case "airtel":
                    System.out.println("Airtel Offer: 1.5GB + Unlimited Calls");
                    break;
                case "jio":
                    System.out.println("Jio Offer: 2GB/day ");
                    break;
                case "vi":
                    System.out.println(" VI Offer: 1GB/day");
                    break;
                default:
                    System.out.println("Invalid operator! Recharge still added without offer.");
            }

                       balance += amount;

            System.out.println("\nRecharge Successful!");
            System.out.println("Current Wallet Balance: ₹" + balance);

            // Ask if user wants another recharge
            System.out.print("\nDo you want to recharge again? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                running = false;
            }
        }

        System.out.println("Thank you for using the Recharge");
        sc.close();
    }
}
