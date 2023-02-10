package Storage.dao;

import Storage.Entity.Lingua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LinguaDAO extends JpaRepository<Lingua, Integer> {
}
