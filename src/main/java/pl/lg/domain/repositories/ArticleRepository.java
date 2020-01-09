package pl.lg.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.domain.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
