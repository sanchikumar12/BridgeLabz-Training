package Day_01;

import java.util.Arrays;

public class LeftRotationByK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        int n = arr.length;
        int[] ans = new int[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            ans[i] = arr[(i + k) % n];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }
}