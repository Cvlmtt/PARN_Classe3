package Storage.dao;

import Storage.Entity.Annuncio;
import Storage.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AziendaDAO extends JpaRepository<Azienda, Integer> {
}
