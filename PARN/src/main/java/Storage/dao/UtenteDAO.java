package Storage.dao;

import Storage.Entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {
}
