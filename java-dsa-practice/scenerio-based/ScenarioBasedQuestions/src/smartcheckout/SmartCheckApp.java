package SmartCheckOut;

public class SmartCheckApp {
   public static void main(String[] agrs) {
	   
	    Customer cus =new Customer("Sanchit","User");
	    ProductManager productmanger =new  ProductManager();
	    
	    Product p1=new Product("Gee",7,98,4783);
	    Product p2=new Product("Banana",12,8900,50);
	    
	    //Addmin add
	    Admin a1 =new Admin("Kurmu","Admin");
	    a1.add(p1, 98);
	    a1.add(p2, 8900);
	    
	    
	    //Add product..
	     System.out.println("You Selected this Product : ..");
	     cus.getProduct(8900);
	    
	    //Adding to cart .....
	    
	     cus.addBilling();
	    
	    //Billig ...
	    cus.processBill();
	    
   }
}
