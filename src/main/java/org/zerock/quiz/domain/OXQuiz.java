package org.zerock.quiz.domain;

public class OXQuiz extends Quiz{

    public OXQuiz(String question, String answer) {
        super(question, answer);
    }


    @Override
    public String getDescription() {
        return "O or X";
    }

    @Override
    public String readQuestion() {
        return this.question;
    }
}
