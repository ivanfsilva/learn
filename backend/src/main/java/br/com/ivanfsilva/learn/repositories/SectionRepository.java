package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}
