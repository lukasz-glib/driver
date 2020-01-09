package pl.lg.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.domain.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
