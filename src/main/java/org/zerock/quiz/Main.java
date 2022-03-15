package org.zerock.quiz;

import org.zerock.quiz.repository.JavaQuizRepositoryImpl;
import org.zerock.quiz.repository.MathQuizRepositoryImpl;
import org.zerock.quiz.repository.QuizRepository;
import org.zerock.quiz.service.QuizService;
import org.zerock.quiz.ui.QuizUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizRepository[] quizRepositories = {
                new JavaQuizRepositoryImpl(),
                new MathQuizRepositoryImpl()
        };
        QuizService quizService = new QuizService(quizRepositories);
        QuizUI quizUI = new QuizUI(quizService, scanner);

        quizUI.selectCategory();
    }
}
