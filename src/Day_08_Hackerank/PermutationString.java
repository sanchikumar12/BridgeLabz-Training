package Day_08_Hackerank;



public class PermutationString {

    static void permute(String str, int index) {

        if (index == str.length()) {
            System.out.println(str);
            return;
        }

        for (int i = index; i < str.length(); i++) {

            // swap
            char[] arr = str.toCharArray();

            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(new String(arr), index + 1);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";

        permute(str, 0);
    }
}