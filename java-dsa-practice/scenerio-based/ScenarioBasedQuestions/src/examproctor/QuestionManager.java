package ExamProctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class QuestionManager {

    private ArrayList<Question> ques = new ArrayList<>();
    private Stack<Question> stack = new Stack<>();
    private int curidx = 0;
    private HashMap<Integer, String> map = new HashMap<>();

    // Add question
    public void addQuestion(Question q) {
        ques.add(q);
    }

    // Get all questions
    public ArrayList<Question> getQuestion() {
        return ques;
    }

    // Navigate forward (one question at a time)
    public void navigate() {
        if (curidx < ques.size()) {
            Question current = ques.get(curidx);
            stack.push(current);
            curidx++;
            System.out.println("Current Question: " + current.question);
        } else {
            System.out.println("No more questions available.");
        }
    }

    // Navigate backward
    public void navigateBack() {
        if (stack.size() > 1) {
            Question current = stack.pop();     // remove current
            Question previous = stack.peek();  // see previous
            curidx--;
            System.out.println(
                "Navigated back from \"" + current.question +
                "\" to \"" + previous.question + "\""
            );
        } else {
            System.out.println("Cannot navigate back. No previous question.");
        }
    }

    // Get last visited question (without removing)
    public void getLast() {
        if (!stack.isEmpty()) {
            Question last = stack.peek();
            System.out.println("Last Question: " + last.question);
        } else {
            System.out.println("No questions visited yet.");
        }
    }

    // Store or update answer
    public void answerQue(int qid, String ans) {
        map.put(qid, ans);
    }

    // Calculate total score
    public int getTotal() {
        return map.size() * 5;
    }
}
