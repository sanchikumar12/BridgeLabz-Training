package Day_16_classroom;

public class Box{

	public static  <T> void display(T[] v) {
		for(T a:v) {
			System.out.println(a);	
		}
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
