package Day_08_Classroom;

import java.util.*;

public class Permutation {

    public static List<ArrayList<Integer>> list;

    public Permutation() {

        list = new ArrayList<>();

        int[] a = new int[]{2, 3, 4};

        getPer(0, a);

        for (ArrayList<Integer> x : list) {
            System.out.println(x);
        }
    }

    public static void getPer(int pos, int[] ar) {

        if (pos >= ar.length) {

            List<Integer> l = new ArrayList<>();

            for (int i = 0; i < ar.length; i++) {
                l.add(ar[i]);
            }

            list.add(new ArrayList<>(l));

            return;
        }

        for (int i = pos; i < ar.length; i++) {

            swap(pos, i, ar);

            getPer(pos + 1, ar);

            // backtracking
            swap(pos, i, ar);
        }
    }

    public static void swap(int i, int j, int[] a) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        new Permutation();
    }
}