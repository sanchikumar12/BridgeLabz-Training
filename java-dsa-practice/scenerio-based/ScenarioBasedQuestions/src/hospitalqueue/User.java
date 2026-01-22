package hospitalqueue;

public class User extends hospitalservice {
	
	public String name;
	public String role;
	
	public User(String name,String role) {
		this.name=name;
		this.role=role;
	}
	
	public void addPatient(Patient p) {
		super.addPatient(p);
	}
	
	
	public void displayDetail() {
		super.displaySeats();
	}
	
	

}
