


import java.io.*;
import java.util.*;

public class Quicksort2Sorting {

   

      static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {

    if (arr.size() <= 1)
        return arr;

    int pivot = arr.get(0);

    ArrayList<Integer> left = new ArrayList<>();
    ArrayList<Integer> equal = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();

    for (int x : arr) {
        if (x < pivot)
            left.add(x);
        else if (x == pivot)
            equal.add(x);
        else
            right.add(x);
    }

    left = quickSort(left);
    right = quickSort(right);

    ArrayList<Integer> ans = new ArrayList<>();

    ans.addAll(left);
    ans.addAll(equal);
    ans.addAll(right);

    for (int x : ans)
        System.out.print(x + " ");
    System.out.println();

    return ans;
}
    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++)
            arr.add(sc.nextInt());

        quickSort(arr);
    }
}


