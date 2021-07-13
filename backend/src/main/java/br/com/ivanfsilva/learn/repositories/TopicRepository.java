package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
}
