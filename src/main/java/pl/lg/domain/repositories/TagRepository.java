package pl.lg.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.domain.entities.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
