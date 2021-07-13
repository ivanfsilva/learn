package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver,Long> {
}
