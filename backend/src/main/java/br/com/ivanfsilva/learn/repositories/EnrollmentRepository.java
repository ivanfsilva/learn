package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Enrollment;
import br.com.ivanfsilva.learn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
