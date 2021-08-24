package net.cho.api.Quiz.service;

import net.cho.api.Quiz.Domain.Quiz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.BDDMockito.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class QuizServiceImplTest {
    private QuizServiceImpl quizService;
    @Mock GeneratorServiceImpl generatorService;
    @BeforeEach
    void setUp() {
        quizService = new QuizServiceImpl(generatorService);

    }
    @DisplayName("50 * 30 = 1500")
    @Test
    void createQuiz() {
        given(generatorService.randomFactor()).willReturn(50,30);
        Quiz quiz = quizService.createQuiz();
        assertThat(quiz.getFactorA(),is(50));
        assertThat(quiz.getFactorB(),is(30));
        assertThat(quiz.getResult(),is(1500));
    }
}