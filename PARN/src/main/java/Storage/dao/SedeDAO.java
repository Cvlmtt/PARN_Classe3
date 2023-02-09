package Storage.dao;

import Storage.Entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SedeDAO extends JpaRepository<Sede, Integer> {
}
