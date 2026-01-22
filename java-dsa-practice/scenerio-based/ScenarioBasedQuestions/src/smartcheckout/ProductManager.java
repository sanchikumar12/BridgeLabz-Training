package SmartCheckOut;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductManager {
	
	public static HashMap<Integer,Product> map =new HashMap<>();
	
	public void add(Product product,int pid) {
		
		if(map.containsKey(pid)) {
			Product p=map.get(pid);
			int val=p.getQuantity();
			p.setQuantity(val+1);
			map.put(pid,p );
		}else {
			map.put(pid, product);
		}
	}
	
	
	public void updateQuantity(Product product,int pid) {
		if(map.containsKey(pid)) {
			Product p=map.get(pid);
			int val=p.getQuantity();
			p.setQuantity(val+1);
			map.put(pid,p );
		}else {
			map.put(pid, product);
		}
	} 
	
	
	public Product getProduct(int pid) {
		
		if(map.containsKey(pid)){
			Product pp =map.get(pid);
			return pp;
		}
		
		return null;
	}
	

	
	
	
	
	
	

}
