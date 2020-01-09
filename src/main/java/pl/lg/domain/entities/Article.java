package pl.lg.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false, columnDefinition = "varchar(15000)")
    private String contentText;

    private String videoContent;

    @ManyToMany
    private Set<Tag> tags;

    @Column(nullable = false)
    private Integer likes;

    @Column(nullable = false)
    private Integer shares;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(nullable = false)
    private LocalDateTime updated;

    @Column(nullable = false)
    private Boolean isAdviceOfTheWeek;

    @Column(nullable = false)
    private Boolean hasQuiz;

    @OneToMany
    private List<Quiz> quizQuestions = new ArrayList<>();
}
