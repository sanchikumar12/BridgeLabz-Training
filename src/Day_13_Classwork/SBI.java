package Day_13_Classwork;

public class SBI extends Bank {
	 private int ammount;
	 
	 public void setAmount(int amount) {
		 this.ammount=amount;
	 } 
	 
	 public int getAmount() {
		 return this.ammount;
	 }
	
	

	@Override
	public void witdraw() {
		System.out.println("Your money:"+this.ammount);
		
	}
	
	@Override
	public void display() {
		System.out.println("Welcome to SBI");
	}
	
	public static void main(String [] agrs) {
		SBI sbi =new SBI();
		sbi.setAmount(590);
		sbi.display();
		sbi.witdraw();
		
	}

	

}
