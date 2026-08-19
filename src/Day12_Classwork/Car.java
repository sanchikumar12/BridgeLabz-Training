package Day12_Classwork;

public class Car{
	
	public static String brand="BMW";
	public int model;
	
	public Car(int m) {
		
		this.model=m;
	}
	
	public static void main(String[] agrs) {
		Car c1 =new Car(234);
		Car c2 =c1;
		Car.brand="TOYATA";
		
		System.out.println(c2.brand);
	}
	
       
	

}
