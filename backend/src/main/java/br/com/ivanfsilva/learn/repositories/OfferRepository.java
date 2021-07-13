package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
