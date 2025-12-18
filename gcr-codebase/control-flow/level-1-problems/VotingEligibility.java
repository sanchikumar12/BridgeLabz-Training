import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get age input from user
       System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person can vote.");
        } else {
            System.out.println("The person cannot vote.");
        }

        sc.close();
    }
}
