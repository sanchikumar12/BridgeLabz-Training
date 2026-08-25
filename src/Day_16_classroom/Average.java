package Day_16_classroom;

public class Average{

	public static  <T extends Number> double average(T[] v) {
		int c=0;
		double sum=0;
		for(T a:v) {
			sum+=(double)a;
			c++;
		}
		
		return sum/c;
	}
	
	public static void main(String[]agrs) {
		String[] ar= new String[2];
		ar[0]="Sanchit";
		ar[1]="Kumar";
		
		Integer[] a=new Integer[] {1,2,3,4,5};
		Box.display(a);
		Box.display(ar);
		
	}

}
