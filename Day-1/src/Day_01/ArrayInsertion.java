package Day_01;

import java.util.Arrays;

public class ArrayInsertion {

    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 50};
        int element = 30;
        int index = 2;

        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = element;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}