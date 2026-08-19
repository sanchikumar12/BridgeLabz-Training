package Day_07_Classwork;

public class Factorial {

	public static void main(String [] agrs) {
		int ans=factorial(4);
		System.out.println(ans);
		
		
	}
	
	public static int factorial(int n) 
	{
		if(n==0 ) {
			return 1;
		}
		
		return n*factorial(n-1);
	}

}
