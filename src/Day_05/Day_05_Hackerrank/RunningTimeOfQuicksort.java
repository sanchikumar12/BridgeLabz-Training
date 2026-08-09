package Day_05.Day_05_Hackerrank;

import java.io.*;
import java.util.*;

public class RunningTimeOfQuicksort {
    public static int quickswap = 0;
    public static int insertswap = 0;

    public static int getpivot(int[] arr, int low, int high) {
        int p = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < p) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                quickswap++;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        quickswap++;
        return i;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = getpivot(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                insertswap++;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        sc.close();

        quicksort(arr, 0, n - 1);
        insertionsort(temp);
        
        System.out.println(insertswap - quickswap);
    }
}
