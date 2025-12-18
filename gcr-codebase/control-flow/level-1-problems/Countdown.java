import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        


        System.out.println("Launch!");
        sc.close();
    }
}
