package SmartCheckOut;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Customer extends User {
	
	public Queue<Bill> bill =new LinkedList<>();
	public List<Product> cart =new LinkedList<>();
	

	public Customer(String name, String role) {
		super(name, role);
		
	}
	
	
	
	 public Product getProduct(int pid) {
		  Product cr =super.getProduct(pid);
		  cart.add(cr);
		  System.out.println(cr.getName());
		return cr;
	}
   
   public void addBilling() {
	   int total =0;
	   for(Product p:cart) {
		    Customer cr=this;
		    Product crp =p;
		    //Adding to Bill;
		    Bill newbill=new Bill(cr,p);
		  
		    bill.add(newbill);
		    System.out.println("Succesfully added to cart ......"+crp.getName());
		    
		    
		   
	   }
   }
   
   public void processBill() {
	   System.out.println("Your Billing Summery is : ........");
	   int total =0;
	   while(!bill.isEmpty()) {
		   Bill b =bill.poll();
		   
		   System.out.println("Your Product name is :"+b.product.getName());
		   System.out.println("Your Product Price is :"+b.product.getPrice());
		   System.out.println("Your Product Pid is :"+b.product.getPid());
		  
		   total+=b.product.getPrice();
		   
		   
	   }
	   
	   System.out.println("Your Total Price is :"+total);
   }
   
	
	
}


	
	



