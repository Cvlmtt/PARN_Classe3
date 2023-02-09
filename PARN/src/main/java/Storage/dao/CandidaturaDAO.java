package Storage.dao;

import Storage.Entity.Candidatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CandidaturaDAO extends JpaRepository<Candidatura, Integer> {
}
