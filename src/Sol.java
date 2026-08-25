import java.util.*;
public class Sol{
	public static void main(String[]agrs) {
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int [] ar=new int[n];
			PriorityQueue<Integer> q =new PriorityQueue<>();
			
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
				q.offer(ar[i]);
			}
			boolean isans =true;
			while(q.size()>1) {
				int val =q.poll();
				int dif =Math.abs(val-q.peek());
				
				if(dif>1) {
					isans=false;
				}
			}
			
			if(isans) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
			
			
			
			
			

           
		    }
	}
	
}
	
	
