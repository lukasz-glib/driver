package pl.lg.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.domain.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
