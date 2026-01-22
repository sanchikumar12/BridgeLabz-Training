package ExamProctor;

import java.util.ArrayList;

public class Admin extends QuestionManager{
	
	public String name;
	public String role;
	
	public Admin(String name,String role) {
		this.name=name;
		this.role=role;
	}
     
	  public void addQuestion(Question q) {
		  super.addQuestion(q);
	  }
	  
	  public ArrayList<Question> getQuestion(){
		  return super.getQuestion();
	  }
	  
	  public void calculateMark() {
		  super.getTotal();
	  }
	  
	  
	  
	  
	
}
