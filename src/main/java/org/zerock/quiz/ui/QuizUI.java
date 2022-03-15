package org.zerock.quiz.ui;

import lombok.AllArgsConstructor;
import org.zerock.quiz.domain.Quiz;
import org.zerock.quiz.service.QuizService;

import java.util.Scanner;

@AllArgsConstructor
public class QuizUI {
    private QuizService quizService;
    private Scanner scanner;

    public void selectCategory() {
        System.out.println("퀴즈의 카테고리를 선택해주세요.");
        String[] categories = quizService.getCategories();
        for (int i = 0; i < categories.length; i++) {
            System.out.println(i + ": " + categories[i]);
        }
        System.out.print(">>");
        quizService.setSelectedRepository(Integer.parseInt(scanner.nextLine()));
        play();
    }

    private void play() {
        while (true) {
            Quiz quiz = null;
            try {
                quiz = quizService.getNextQuiz();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
            System.out.println(quiz.getDescription());
            System.out.println(quiz.readQuestion());
            System.out.print("답을 적어주세요.>>");
            String userAnswer = scanner.nextLine();
            boolean result = quiz.isCorrect(userAnswer);
            if (result) {
                System.out.println("정답 입니다! 다음 문제로 넘어갑니다.");
            } else {
                System.out.println("틀렸습니다. ㅂㅂ");
                break;
            }
        }
    }
}
