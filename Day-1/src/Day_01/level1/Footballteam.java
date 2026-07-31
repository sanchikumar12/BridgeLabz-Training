package Day_01.level1;
/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team*/

import java.util.*;
public class Footballteam {
	
	public static void main(String [] agrs) {
		
		 Scanner sc = new Scanner(System.in);

	        double[] height = new double[11];
	        double sum = 0;
	        double mean=0;

	        for (int i = 0; i < 11; i++) {
	            height[i] = sc.nextDouble();
	        }

	        for (int i = 0; i < 11; i++) {
	            sum = sum + height[i];
	        }

	        mean = sum / 11;

	        System.out.println("Mean Height = " + mean);

	        sc.close();
		
		
		
	}

	
}
