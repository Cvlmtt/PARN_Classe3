package Storage.dao;

import Storage.Entity.EsperienzaLavorativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EsperienzaLavorativaDAO extends JpaRepository<EsperienzaLavorativa, Integer> {
}
