package org.zerock.quiz.domain;

public class MultipleChoiceQuiz extends Quiz{

    private String[] choices;

    public MultipleChoiceQuiz(String question, String answer, String[] choices) {
        super(question, answer);
        this.choices = choices;
    }

    @Override
    public String getDescription() {
        return "다음 보기중 하나를 고르시오.(1~5 입력)";
    }

    @Override
    public String readQuestion() {
        String result = this.question;
        for (int i = 0; i < choices.length; i++) {
            result += String.format("\n%d: %s", i + 1, choices[i]);
        }
        return result;
    }
}
