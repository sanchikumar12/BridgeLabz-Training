import java.util.Scanner;

public class PushUpTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] week = new int[7];  
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
                         "Friday", "Saturday", "Sunday"};


        for (int i = 0; i < 7; i++) {
            System.out.print("Enter push-ups for " + days[i] + ": ");
            week[i] = sc.nextInt();
        }

        int total = 0;
        int activeDays = 0;

        for (int count : week) {
            if (count == 0) {
                continue;              }

            total += count;
            activeDays++;
        }

        double average = (activeDays > 0) ? (double) total / activeDays : 0;

        System.out.println("\nTotal push-ups (active days only): " + total);
        System.out.println("Average is : " + average);
    }
}
