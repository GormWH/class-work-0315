package org.zerock.quiz.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Quiz {

    protected String question;
    protected String answer;

    public boolean isCorrect(String userAnswer) {
        return answer.equals(userAnswer);
    }

    public abstract String getDescription();

    public abstract String readQuestion();
}
