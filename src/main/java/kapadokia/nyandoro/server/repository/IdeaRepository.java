package kapadokia.nyandoro.server.repository;

import kapadokia.nyandoro.server.model.Idea;
import org.springframework.data.repository.CrudRepository;

public interface IdeaRepository extends CrudRepository<Idea, Long> {
}
