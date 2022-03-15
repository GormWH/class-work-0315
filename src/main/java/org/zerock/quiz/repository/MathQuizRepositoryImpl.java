package org.zerock.quiz.repository;

import org.zerock.quiz.domain.MultipleChoiceQuiz;
import org.zerock.quiz.domain.OXQuiz;
import org.zerock.quiz.domain.Quiz;

public class MathQuizRepositoryImpl implements QuizRepository{
    private Quiz[] quizes;

    public MathQuizRepositoryImpl() {
        OXQuiz quiz1 = new OXQuiz("+는 더하기 기호다", "O");
        OXQuiz quiz2 = new OXQuiz("e는 2.8보다 크다", "X");
        MultipleChoiceQuiz quiz3 = new MultipleChoiceQuiz("1 + 1 = ?", "2", new String[] {"1", "2", "3", "4", "5"});
        this.quizes = new Quiz[3];
        quizes[0] = quiz1;
        quizes[1] = quiz2;
        quizes[2] = quiz3;
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
        return "수학";
    }
}
