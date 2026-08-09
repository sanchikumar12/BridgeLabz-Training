package Day_01.Day_01_Classwork;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            return;
        }

  
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--; 

        System.out.println("Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
