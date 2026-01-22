package SmartCheckOut;

public class Admin extends User{

	public Admin(String name, String role) {
		super(name, role);
		// TODO Auto-generated constructor stub
	}
	
	public void add(Product product,int pid) {
		
		super.add(product, pid);
		System.out.println("Succesfull Added");
			
		}
	
	public void updateQuantity(Product product,int pid) {
		super.updateQuantity(product, pid);
	} 
	
   public Product getProduct(int pid) {
		  Product cr =super.getProduct(pid);
		  System.out.println(cr.getName());
		return cr;
	}

}
