package Day12_Classwork;

public class Call extends Access {

	public Call(String n, int u, String s) {
		super(n, u, s);
	}
			
		public void accesprotected() {
			int uu=super.uid;
			System.out.println(uu);
		}
		
		public void accesprivate() {
			int a=super.age;
			System.out.println("Not Accesable");
		}
		
		public void accesdefault() {
			String a=super.address;
			System.out.println("Accesable");
		}
		
		

	public static void main(String[] agrs) {
		Access pa =new Access("Kumar",34,"Bhoapl");
		
		pa.setAge(54);
		Call c =new Call("Ram",45,"Ranchi");
		//Print public 
		System.out.println(pa.name);
		//Print Private
		System.out.println(pa.age);
		//Printe Protected
		System.out.println(pa.uid);
		
		//Print Public 
		System.out.println(pa.address);
		
	}

}
