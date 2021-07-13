package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
