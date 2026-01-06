package com.oopspracticescenariobasedquestions.edumentor;

import java.util.*;

public class EduMentorApp {
 public static void main(String[] args) {

     Instructor instructor = new Instructor("Sanchit Kumar", "sanchitkumar@3455gmail.com", "5990");
     Learner learner = new Learner("Aditi", "aditi@mail.com", "LR01");

     Quiz quiz = instructor.createQuiz("easy");

     quiz.showQuestions();

     quiz.submitAnswer("4");
     quiz.submitAnswer("New Delhi");

     quiz.evaluate();

     System.out.println("Quiz Score: " + quiz.getPercentage() + "%");

     // Polymorphic certificate
     System.out.println("\n" + learner.generateCertificate());
 }
}
