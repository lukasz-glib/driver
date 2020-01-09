package pl.lg.dtos;

import lombok.Data;

import java.util.HashMap;

@Data
public class QuizDataDTO {

    private String question;
    private HashMap<Integer, String> textAnswer;
    private HashMap<Integer, String> pictureAnswer;
    private HashMap<Integer, Boolean> ifAnswerIsCorrect;
}
