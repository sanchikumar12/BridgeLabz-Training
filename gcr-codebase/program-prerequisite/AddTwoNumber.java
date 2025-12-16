import java.util.Scanner;
public class AddTwoNumber{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int first = sc.nextInt();
	int second = sc.nextInt();
	
	int sum = first + second;
	
	System.out.println("The sum of " + first + " and " + second  + " is "+sum);
    }
}