package br.com.ivanfsilva.learn.repositories;

import br.com.ivanfsilva.learn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
