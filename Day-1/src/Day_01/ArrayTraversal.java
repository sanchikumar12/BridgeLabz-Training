package Day_01;



public class ArrayTraversal {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}