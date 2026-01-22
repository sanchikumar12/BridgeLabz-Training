package SmartCheckOut;

public class Product {
   private String name;
   private int quantity;
   private int pid;
   private int price;
   
   public Product(String name,int qunatity,int pid,int price) {
	   this.setName(name);
	   this.setQuantity(qunatity);
	   this.setPid(pid);
	   this.setPrice(price);
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public int getPid() {
	return pid;
   }

   public void setPid(int pid) {
	this.pid = pid;
   }

   public int getQuantity() {
	return quantity;
   }

   public void setQuantity(int quantity) {
	this.quantity = quantity;
   }

   public int getPrice() {
	return price;
   }

   public void setPrice(int price) {
	this.price = price;
   }
   
   
}
