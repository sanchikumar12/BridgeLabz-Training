package com.oopspracticescenariobasedquestions.edumentor;

import java.util.ArrayList;
import java.util.List;

class Quiz {
    private List<String> questions;         // private question bank
    private List<String> correctAnswers;    // fully encapsulated
    private List<String> submittedAnswers;  // learner's answers
    private int score;

    // Difficulty-based Constructor
    public Quiz(String difficulty) {
        questions = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        submittedAnswers = new ArrayList<>();

        if (difficulty.equalsIgnoreCase("easy")) {
            loadEasyQuiz();
        } else if (difficulty.equalsIgnoreCase("medium")) {
            loadMediumQuiz();
        } else {
            loadHardQuiz();
        }
    }

    // Private internal loaders (encapsulation)
    private void loadEasyQuiz() {
        questions.add("2 + 2 = ?");
        correctAnswers.add("4");

        questions.add("Capital of India?");
        correctAnswers.add("New Delhi");
    }

    private void loadMediumQuiz() {
        questions.add("Solve: 5 * 6");
        correctAnswers.add("30");

        questions.add("H2O is known as?");
        correctAnswers.add("Water");
    }

    private void loadHardQuiz() {
        questions.add("Derivative of x^2?");
        correctAnswers.add("2x");

        questions.add("What is polymorphism?");
        correctAnswers.add("OOP concept");
    }

    // Encapsulated → No method to modify answers after submission
    public void submitAnswer(String ans) {
        if (submittedAnswers.size() < questions.size()) {
            submittedAnswers.add(ans);
        }
    }

    // Simulated operator-like scoring
    public void evaluate() {
        score = 0;
        for (int i = 0; i < submittedAnswers.size(); i++) {
            if (submittedAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
                score++;
            }
        }
    }

    public double getPercentage() {
        if (questions.isEmpty()) return 0;
        return (score * 100.0) / questions.size();
    }

    public void showQuestions() {
        System.out.println("----- Quiz -----");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }
}
