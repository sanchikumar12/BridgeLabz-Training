package Day12_Classwork;

public class Access {
	
	public String name;
	
	private int age;
	protected int uid;
	 String address;
	
	public Access(String n ,int u ,String s) {
		this.name=n;
		this.uid=u;
		this.address =s;
	}
	
	public void setAge(int a) {
		this.age=a;
	}

	

}
