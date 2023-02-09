package Storage.dao;

import Storage.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaDAO extends JpaRepository<Persona, Integer> {
}
