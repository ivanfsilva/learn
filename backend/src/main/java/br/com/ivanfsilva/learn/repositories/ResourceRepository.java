package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
