package com.oopspracticescenariobasedquestions.edumentor;

import java.util.ArrayList;
import java.util.List;

class Learner extends User implements ICertifiable {
    private List<Quiz> quizzesTaken = new ArrayList<>();

    public Learner(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void takeQuiz(Quiz quiz) {
        quizzesTaken.add(quiz);
    }

    @Override
    public String generateCertificate() {
        return "Certificate of Completion (Short Course)\nAwarded to: " + name;
    }
}
