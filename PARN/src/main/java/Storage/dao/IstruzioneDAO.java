package Storage.dao;

import Storage.Entity.Istruzione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IstruzioneDAO extends JpaRepository<Istruzione, Integer> {
}
