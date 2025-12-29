import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1; 
        int attempts = 0;
        int guess;

              System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secret) {
                System.out.println("Too high");
            } else if (guess < secret) {
                System.out.println("Too low");
            } else {
                System.out.println(" You guessed it in " + attempts + " attempts.");
                break;
            }

            if (attempts == 5) {
                System.out.println(" You've used all 5 attempts. The number was: " + secret);
            }

        } while (attempts < 5);

        sc.close();
    }
}
