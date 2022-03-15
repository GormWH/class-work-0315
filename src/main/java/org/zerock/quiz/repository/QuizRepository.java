package org.zerock.quiz.repository;

import org.zerock.quiz.domain.Quiz;

public interface QuizRepository {
    Quiz getQuiz(int index);
    int size();
    String toString();
}
