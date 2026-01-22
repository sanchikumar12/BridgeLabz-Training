package hospitalqueue;

public class HospitalApp {
     public static void main(String[] agrs) {
    	 Patient p1=new Patient("Sanchit","Patient");
    	 p1.setlevel(5);
    	 
    	 Patient p2=new Patient("Rakesh Tiwari","Patient");
    	 p2.setlevel(5);
    	 
    	 
    	 //Adding patient ==>
    	 p1.addPatient(p1);
    	 p2.addPatient(p2);
    	 
    	 Admin a1 =new Admin("Sanchit","Admin");
    	 a1.assignRoom();
    	 a1.displayDetail();
     }
}
