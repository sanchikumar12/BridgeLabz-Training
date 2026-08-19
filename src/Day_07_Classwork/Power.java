package Day_07_Classwork;

public class Power {

	public static void main(String[] agrs) {
		
		int ans =power(5,2);
		System.out.println(ans);
		
	}
	
	public static int power(int n ,int ex) {
		if(ex==0) {
			return 1;
		}
		
		return n*power(n,ex-1);
	}

}
