package Storage.dao;

import Storage.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {
}
