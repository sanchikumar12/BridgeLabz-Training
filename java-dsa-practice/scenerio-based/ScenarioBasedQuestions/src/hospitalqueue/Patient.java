package hospitalqueue;

public class Patient extends User{
	
	private int level;
	public int arrivaltime;
	

	public Patient(String name, String role) {
		super(name, role);
		
		// TODO Auto-generated constructor stub
	}
	
	public void setlevel(int l) {
		this.level=l;
	}
	
	public int getlevel() {
		return this.level;
	}
	
	public void setTime(int at) {
		this.arrivaltime=at;
	}
	
	public int getTime() {
		return arrivaltime;
	}
   
	
	 
}
