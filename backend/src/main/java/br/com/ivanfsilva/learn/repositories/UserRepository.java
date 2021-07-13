package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
