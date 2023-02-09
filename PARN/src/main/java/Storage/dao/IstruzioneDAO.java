package Storage.dao;

import Storage.Entity.Istruzione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IstruzioneDAO extends JpaRepository<Istruzione, Integer> {
}
