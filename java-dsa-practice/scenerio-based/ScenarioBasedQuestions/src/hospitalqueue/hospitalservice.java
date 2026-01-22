package hospitalqueue;

import java.util.ArrayList;

public class hospitalservice {

	   ArrayList<Patient> seats =new ArrayList<>();
	   ArrayList<Patient> patients =new ArrayList<>();
	   int res[] =new int[patients.size()];
	   
	   
	   public void addPatient(Patient p) {
		   patients.add(p);
	   }
	   
	   public Patient[] convertToArray() {
		   int n =patients.size();
		   Patient res [] =new Patient[n];
		   
		   for(int i =0;i<n;i++) {
			   Patient cr =patients.get(i);
			   res[i]=cr;
		   }
		   
		   return res;
	   }
	   
	   public  Patient[] sortByLevel() {
		   
		             
		            Patient res [] =convertToArray();

		          

		           
		                int n = res.length;

		                for (int i = 0; i < n - 1; i++) {
		                    for (int j = 0; j < n - i - 1; j++) {
		                    	Patient cj=res[j];
		                    	Patient jj=res[j];
		                        if (cj.getlevel()> jj.getlevel()) {
		                        	Patient temp = res[j];
		                            res[j] = res[j + 1];
		                            res[j + 1] = temp;
		                        }
		                    }
		                }
		            

		        return res;

			    }
	   
	   
	   public void assignBed() {
		    Patient [] res= sortByLevel();
		  for(Patient p :res) {
			  seats.add(p);
		  }
		   
		   
	   }
	   
	   public void displaySeats() {
		   int idx=0;
		   while(idx<seats.size()) {
			   Patient cr =seats.get(idx);
			   
			   System.out.println("The name is :"+cr.name);
			   System.out.println("The level of emergengy :"+cr.getlevel());
			   System.out.println("The assigned Room number is  :"+(idx+1));
		   }
	   }
	   

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
