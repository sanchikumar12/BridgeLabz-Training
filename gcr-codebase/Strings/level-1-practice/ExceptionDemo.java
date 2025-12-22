import java.util.Scanner;

public class ExceptionDemo {

    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); 
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program stopped due to unhandled exception: " + e);
        }

        handleException(names);

        System.out.print("Enter text to convert to uppercase: ");
        String text = sc.nextLine();
        String upper = text.toUpperCase();

        System.out.println("Uppercase text: " + upper);
        System.out.println("Comparison result: " + text.equals(upper));
    }
}
