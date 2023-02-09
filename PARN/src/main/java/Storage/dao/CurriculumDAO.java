package Storage.dao;

import Storage.Entity.Annuncio;
import Storage.Entity.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CurriculumDAO extends JpaRepository<Curriculum, Integer> {
}
