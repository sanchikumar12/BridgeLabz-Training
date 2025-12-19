import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;                
        int index = 0;                      

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();

            
            if (value <= 0) {
                break;
            }

            
            if (index == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

            numbers[index] = value;  // store the number
            index++;                 // move to next index
        }

        // Sum and display all numbers
        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal = " + total);
        sc.close();
    }
}
