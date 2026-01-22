package hospitalqueue;

public class Admin extends User{

	public Admin(String name, String role) {
		super(name, role);
		
	}
	
	public void assignRoom() {
		super.assignBed();
	}

}
