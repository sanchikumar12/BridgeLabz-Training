package com.linkedlist.singlylinkedlist;

public class StudentRecord {
	StudentNode head;
	
   public StudentRecord() {
	   this.head=null;
   }
   public void addEmployee(int id ,String name,String department) 
	{
		StudentNode temp=head;
		StudentNode data =new StudentNode(id,name,department,1500);
		
		
		//if head is empty ==>
		if(head==null) {
			head=data;
			return;
		}else {
			
			while(temp.next!=null) {
				temp =temp.next;
			}
			
			temp.next=data;
		}
		
		
		
		
	}
   
   
   public void searchNode(int id ,String name) {
	   String search =name.trim();
	   StudentNode temp =head;
	   
	    if(head==null) {
	    	return ;
	    }else {
	    	
	    	while(temp!=null) {
	    		 if(temp.id==id || temp.name.equals(search)) {
	    			 System.out.println("The Detail found is :"+temp.id + " "+ temp.name);
	    			 break;
	    		 }
	    		temp=temp.next;
	    		
	    	}
	    }
	    
	    
	   
   }
   
   
   public void displayInfo()
   {
	   StudentNode temp =head;
	   
	   while(temp!=null) {
		   
			 System.out.println("The Detail  id is :"+temp.id + "the name is "+ temp.name+ "the Department " +temp.Department+ " "+temp.Salary);
		   
		   temp =temp.next;
	   }
	   
	   
	   
	   
   }   
   public void deletEmployee(int id) 
	{
	

		    if (head == null) {          // Case 1: list is empty
		        return;
		    }

		   
		    if (head.id == id) {
		        head = head.next;        
		        return;
		    }

		    StudentNode temp = head;
		    StudentNode prev = null;

		    // Case 3: search for the node to delete
		    while (temp != null && temp.id != id) {
		        prev = temp;
		        temp = temp.next;
		    }

		    // Case 4: id not found
		    if (temp == null) {
		        return;
		    }

		    // Case 5: delete the found node
		    prev.next = temp.next;
		

		
		
	}
   
	public static void main(String[] args) {
		
		StudentRecord studentnode =new StudentRecord();
		studentnode.addEmployee(1, "Sanchit Kumar", "10000");
		studentnode.addEmployee(2, "Mangalam Kumar", "12000");
		studentnode.addEmployee(3, "Raghav Kumar", "13000");
         
		studentnode.displayInfo();
		studentnode.searchNode(1, "Sanchit Kumar");
		
		studentnode.deletEmployee(3);
		studentnode.displayInfo();
		
	}

}
