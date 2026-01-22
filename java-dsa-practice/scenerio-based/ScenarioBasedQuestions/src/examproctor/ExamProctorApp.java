package ExamProctor;

import java.util.ArrayList;

public class ExamProctorApp {

	public static void main(String[] args) {
		
           User u1 =new User("Rohit",45);
           Admin a1 =new Admin("harsh","admin");
           Question q1 =new Question("What is National Bird of India ", 1, "Peacock");
           a1.addQuestion(q1);
           
           ArrayList<Question> ques=a1.getQuestion();
          
           //User is navigation to the next page--?
           u1.navigate();
           
           //User is navigating back  -->
           u1.navigateBack();
           //Admin getting the last Question-->
           a1.getLast();
           u1.getLast();
           u1.answer(1, "Peacock");
           
           int score=u1.getTotal();
           System.out.println("The total score is "+score);           
           
           
          
	}

}
