package org.zerock.quiz.repository;

import org.zerock.quiz.domain.MultipleChoiceQuiz;
import org.zerock.quiz.domain.OXQuiz;
import org.zerock.quiz.domain.Quiz;

public class JavaQuizRepositoryImpl implements QuizRepository{
    private Quiz[] quizes;

    public JavaQuizRepositoryImpl() {
        OXQuiz quiz1 = new OXQuiz("자바는 객체지향 언어이다", "O");
        MultipleChoiceQuiz quiz2 = new MultipleChoiceQuiz("자바의 스펠링은?", "1", new String[] {"JAVA", "ZABA", "ZAVA", "JABA"});
        quizes = new Quiz[2];
        quizes[0] = quiz1;
        quizes[1] = quiz2;
    }

    @Override
    public Quiz getQuiz(int index) {
        return quizes[index];
    }

    @Override
    public int size() {
        return quizes.length;
    }

    @Override
    public String toString() {
        return "자바";
    }
}
