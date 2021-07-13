package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
