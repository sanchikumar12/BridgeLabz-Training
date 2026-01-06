package com.oopspracticescenariobasedquestions.edumentor;

class Instructor extends User {

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

    public Quiz createQuiz(String difficulty) {
        return new Quiz(difficulty);
    }
}
