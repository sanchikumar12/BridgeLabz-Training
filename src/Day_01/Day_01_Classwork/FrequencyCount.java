package Day_01.Day_01_Classwork;

import java.util.HashMap;



public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }

        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
