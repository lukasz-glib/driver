package pl.lg.dtos;

import lombok.Data;
import pl.lg.domain.entities.Quiz;
import pl.lg.domain.entities.Tag;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class ArticleDataDTO {

    private Long id;
    private String title;
    private String contentText;
    private String videoContent;
    private Set<Tag> tags = new HashSet<>();
    private Integer likes = 0;
    private Integer shares = 0;
    private LocalDateTime created = LocalDateTime.now();
    private LocalDateTime updated = LocalDateTime.now();
    private Boolean isAdviceOfTheWeek = Boolean.FALSE;
    private Boolean hasQuiz = Boolean.FALSE;
    private List<Quiz> quizQuestions = new ArrayList<>();

}
