package Storage.dao;

import Storage.Entity.Candidatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidaturaDAO extends JpaRepository<Candidatura, Integer> {
}
