package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
