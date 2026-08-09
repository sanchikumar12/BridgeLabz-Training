package Day_06.Day_06_Classwork;
import java.util.*;
public class BinarySearch {

	public static void main(String[]agrs) {
		Scanner sc =new Scanner (System.in);
		int n =sc.nextInt();
		int []arr =new int[n];
		int target=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int low=0;
		int right=n-1;
		int ans =-1;
		
		while(low<=right) {
			
			int mid =low+(right-low)/2;
			
			if(arr[mid]==target) {
				ans=mid;
				System.out.println("Element found :"+mid);
				return;
			}else if(arr[mid]>target) {
				mid =right-1;
			}else if(arr[mid]<target) {
				mid =low-1;
			}
		
		}
		
		if(ans==-1) {
			System.out.println("Not Found ");
		}
		
		
	}

}
