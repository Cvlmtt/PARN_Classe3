package Storage.dao;

import Storage.Entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UtenteDAO extends JpaRepository<Utente, Integer> {
}
