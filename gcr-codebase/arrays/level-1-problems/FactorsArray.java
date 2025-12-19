import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxFactor = 10;                     // initial array size
        int[] factors = new int[maxFactor];     // array to store factors
        int index = 0;                          // current index

        // find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                // if array full → resize
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;        // double the size
                    int[] temp = new int[maxFactor];  // new temp array

                    // copy old elements to temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;   // assign temp to factors
                }

                // store factor
                factors[index] = i;
                index++;
            }
        }

        // display all stored factors
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
