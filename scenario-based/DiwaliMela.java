import java.util.Scanner;

public class DiwaliMela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter visitor's number : ");

            
            if (!sc.hasNextInt()) {
                String temp = sc.next();

                
                if (temp.equalsIgnoreCase("exit")) {
                    System.out.println("Mela closed. Thank you!");
                    break;
                }

          
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            int num = sc.nextInt();

         
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Congratulations! You win a gift!");
            } else {
                System.out.println("No gift this time.");
            }
        }

        sc.close();
    }
}
