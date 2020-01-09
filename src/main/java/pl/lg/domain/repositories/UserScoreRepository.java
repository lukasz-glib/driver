package pl.lg.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.domain.entities.UserScore;

public interface UserScoreRepository extends JpaRepository<UserScore, Long> {

}
