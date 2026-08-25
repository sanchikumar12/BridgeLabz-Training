package Day_06.implementation;
import java.util.*;
public class BinarySearchRecursion {

	public static void main(String[]agrs) {
		
		Scanner sc =new Scanner (System.in);
		int n =sc.nextInt();
		int []arr =new int[n];
		for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int low=0;
	    int high=n-1;
	   
		
		int i=getElement(low, high,arr,target);
		
		System.out.println("Element found on index :"+i);
		
		
		
	}
	
	
	
	public  static  int  getElement(int low,int high,int[]arr,int target) {
		 
		if(low>high) {
			return -1;
		}
		
		int mid =low+(high-low)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		
		if(arr[mid]>target) {
			return getElement(low,mid-1,arr,target);
		}else{
			return getElement(mid+1,high,arr,target);
		}
		
		
		
	
	}

}
