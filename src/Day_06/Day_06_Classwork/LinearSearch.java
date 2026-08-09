package Day_06.Day_06_Classwork;
import java.util.*;
public class LinearSearch {

	public static void main(String[] agrs) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		int search=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean found =false;
		for(int j=0;j<n;j++) {
			if(arr[j]==search) {
				found=true;
			}

			if(found){
				break;
			}
		}
		
		if(found) {
			System.out.println("Element Found");
		}else {
			System.out.println("Not Element Found");
		}
		
		
	}

}
