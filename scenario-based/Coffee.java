// Create coffee class that calculate the amount of coffee purchase
import java.util.Scanner;
public class Coffee {
    public static void main(String[] args) {
		
		//create Scanner class
        Scanner input = new Scanner(System.in);
        String coffeeType;
        double price = 0;
        double GST_RATE = 0.25; 
        int quantity;
        System.out.println("Welcome to the Coffee Shop!");
        while (true) {
            System.out.println("\nEnter coffee type (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha) or type 'exit' to quit:");
            coffeeType = input.nextLine();
			String cofType = "Espresso";
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting!");
                break;
            }
			//switch case that set the price according to coffee
            switch (coffeeType.toLowerCase()) {
                case "1":
                    price = 120;
                    break;
                case "2":
					cofType = "Latte";
                    price = 150;
                    break;
                case "3":
					cofType = "Cappuccino";
                    price = 140;
                    break;
                case "4":
					cofType = "Mocha";
                    price = 160;
                    break;
                default:
                    System.out.println("Enter coffee type. Please try again.");
                    continue; 
            }
            System.out.println("Enter quantity:");
            quantity = input.nextInt();
            input.nextLine(); 
            double total = price * quantity;
            double gstAmount = total * GST_RATE;
            double finalAmount = total + gstAmount;
            
            System.out.println("Total for " + quantity + " " + cofType + "(s): Rs " + total);
            System.out.println("GST (25%): Rs " + gstAmount);
            System.out.println("Final Amount: Rs " + finalAmount);
			
        }
        input.close();
    }
}
