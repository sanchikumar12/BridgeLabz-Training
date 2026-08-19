package Day12_Classwork;

public class CopyConst {
	
	public Car car;
	
	public CopyConst(Car s) {
		this.car =new Car(s.model);
	}
	
	public static void main(String[] agrs) {
		
		Car  c =new Car(345);
		
		CopyConst cc =new CopyConst(c);
		
		System.out.print(cc.car.model);
	}

	

}
