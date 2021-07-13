package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
