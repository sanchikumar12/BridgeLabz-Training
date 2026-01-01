import java.util.*;

public class CurrencyExchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your amount in INR to be converted:");
        double inr = sc.nextDouble();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert INR → USD");
            System.out.println("2. Convert INR → EURO");
            System.out.println("3. Convert INR → GBP");
            System.out.println("4. Convert INR → JPY");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            double converted = 0.0;

            switch (choice) {
                case 1:
                    converted = inr * 0.012;
                    System.out.println("INR " + inr + " = USD " + converted);
                    break;

                case 2:
                    converted = inr * 0.011;
                    System.out.println("INR " + inr + " = EURO " + converted);
                    break;

                case 3:
                    converted = inr * 0.0096;
                    System.out.println("INR " + inr + " = GBP " + converted);
                    break;

                case 4:
                    converted = inr * 1.78;
                    System.out.println("INR " + inr + " = JPY " + converted);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Option!");
            }
        }

        sc.close();
    }
}
