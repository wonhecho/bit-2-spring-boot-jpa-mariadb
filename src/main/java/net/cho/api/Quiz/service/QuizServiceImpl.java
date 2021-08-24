package net.cho.api.Quiz.service;

import lombok.RequiredArgsConstructor;
import net.cho.api.Quiz.Domain.Quiz;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class QuizServiceImpl implements QuizService{
    private final GeneratorService generatorService;
    @Override
    public Quiz createQuiz() {
        return new Quiz(
                generatorService.randomFactor(),
                generatorService.randomFactor()
        );
    }
}
