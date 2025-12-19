import java.util.*;

public class MultiplicationSixToNine {

    public static void main(String[] args) {

        int [] arr =new int[]{6,7,8,9};

        Scanner sc = new Scanner(System.in);
        for(int b:arr){
        int table[] = new int[10];

       
        int number = b;

        int count = 1;
        int idx = 0;

        // Filling the table
        while (count <= 10) {
            table[idx] = number * count;
            count++;
            idx++;
        }

        // Printing the table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

       }

        
    }
}
