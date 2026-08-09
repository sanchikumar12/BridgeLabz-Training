package Day_02.Day_02_Classwork;
import java.util.*;
public class QueueMethod {
	
		public static void main(String[] args) {

		


			      Queue<Integer> q = new LinkedList<>();

			      q.add(10);
			   q.add(20);

			        q.add(30);

			      System.out.println(q);

			 System.out.println(q.peek());

			      System.out.println(q.remove());

			   System.out.println(q);

			      q.offer(40);

			        System.out.println(q);

			   System.out.println(q.poll());

			      System.out.println(q);

			 System.out.println(q.isEmpty());

			      System.out.println(q.size());

			   q.clear();

			      System.out.println(q);

			 System.out.println(q.isEmpty());
			   }
			
}
