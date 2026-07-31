package Day_01.level1;
import java.util.*;
public class Multiplication {
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();

	        int[] multiplicationResult = new int[4];

	        int j = 0;

	        for (int i = 6; i <= 9; i++) {
	            multiplicationResult[j] = number * i;
	            j++;
	        }

	        j = 0;

	        for (int i = 6; i <= 9; i++) {
	            System.out.println(number + " * " + i + " = " + multiplicationResult[j]);
	            j++;
	        }

	        sc.close();
	    }

}
