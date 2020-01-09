package pl.lg.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashMap;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private HashMap<Integer, String> textAnswer;

    @Column(nullable = false)
    private HashMap<Integer, String> pictureAnswer;

    @Column(nullable = false)
    private HashMap<Integer, Boolean> ifAnswerIsCorrect;



}
