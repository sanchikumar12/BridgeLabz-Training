package ExamProctor;

import java.util.ArrayList;

public  class User extends QuestionManager {
	public String name;
	public int rollno ;
	
	public User(String name,int roll) {
		this.name=name;
		this.rollno=roll;
	}
	
	public void navigate() {
		super.navigate();
	}
	
	public void addQue(Question q) {
		super.addQuestion(q);
	}
	
	public ArrayList<Question> getques(){
		return super.getQuestion();
	}
	
	public void  getLast() {
		super.getLast();
	}
	
	public void answer(int qid,String ans) {
		super.answerQue(qid, ans);
	}
	
	
	
	
	

}
