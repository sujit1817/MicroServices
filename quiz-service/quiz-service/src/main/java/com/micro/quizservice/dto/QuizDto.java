package com.micro.quizservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;
}

