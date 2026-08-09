package Day_04_hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BubbleSortResult {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
      
         int[] a = new int[n];

        // Convert List to array
        for (int i = 0; i < n; i++) {
            a[i] = arr.get(i);
        }

        int key = a[n - 1];
        int j = n - 2;

        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];

            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();

            j--;
        }

        a[j + 1] = key;

        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
        
      
     
     

    }

}

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        BubbleSortResult.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
