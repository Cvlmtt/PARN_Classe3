package Storage.dao;

import Storage.Entity.Annuncio;
import Storage.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AziendaDAO extends JpaRepository<Azienda, Integer> {
}
