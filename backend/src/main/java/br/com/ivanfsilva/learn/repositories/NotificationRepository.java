package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Notification;
import br.com.ivanfsilva.learn.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Page<Notification> findByUser(User user, Pageable pageable);
}
