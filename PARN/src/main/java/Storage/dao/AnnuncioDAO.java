package Storage.dao;

import Storage.Entity.Annuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnuncioDAO extends JpaRepository<Annuncio, Integer> {

}