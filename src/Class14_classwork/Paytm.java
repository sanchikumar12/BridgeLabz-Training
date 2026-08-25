package Class14_classwork;

public class Paytm extends GovInd  implements RBI{

	

	@Override
	public void useUPI() {
		System.out.println("Welcome to Paytm Using Rbi apikey...." +apiKey);
		
	}
	
	public static void main(String[] agrs) {
		
		Paytm pay =new Paytm();
		pay.useUPI();
		pay.payTax();
		
	}

}
