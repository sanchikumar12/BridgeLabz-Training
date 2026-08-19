package Day_13_Classwork;

class Encapsulation {
  
	 private int accno;
	 
	 private int amount;
	 
	 public Encapsulation() {
		 this.accno=0;
		 this.amount=0;
	 }
	 
	 public void setAccountNo(int no) {
		 this.accno=no;
	 }
	 
	 public void setAmount(int a) {
		 this.amount=a;
	 }
	 
	 public int getAmount() {
		 return this.amount;
	 }
	 
	 public static void main(String[] agrs) {
		 Encapsulation e=new Encapsulation();
		 e.setAccountNo(234567);
		 e.setAmount(500);
		 System.out.println("Account No is :" +e.getAmount());
	 }
	 
	

}
