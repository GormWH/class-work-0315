package org.zerock.quiz.service;

import org.zerock.quiz.domain.Quiz;
import org.zerock.quiz.repository.QuizRepository;

public class QuizService {

    private int currentIndex;
    private QuizRepository[] quizRepositories;
    private QuizRepository selectedRepository;

    public QuizService(QuizRepository[] quizRepositories) {
        this.quizRepositories = quizRepositories;
        this.currentIndex = 0;
        this.selectedRepository = null;
    }

    public String[] getCategories() {
        String[] result = new String[quizRepositories.length];
        for (int i = 0; i < quizRepositories.length; i++) {
            result[i] = quizRepositories[i].toString();
        }
        return result;
    }

    public void setSelectedRepository(int categoryIndex) {
        this.selectedRepository = quizRepositories[categoryIndex];
    }

    public Quiz getNextQuiz() throws Exception {
        if (currentIndex >= selectedRepository.size()) {
            throw new Exception("남아있는 문제가 없습니다. 프로그램을 종료합니다.");
        }
        return selectedRepository.getQuiz(currentIndex++);
    }
}
