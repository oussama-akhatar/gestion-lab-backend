package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.DotationUCARech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DotationUCARechRepository extends JpaRepository<DotationUCARech, Long> {
    void deleteDotationUCARechById(Long id);
    Optional<DotationUCARech> findDotationUCARechById(Long id);

    @Query("SELECT SUM(d.dotateurBase) FROM DotationUCARech d")
    double sumDotationsUcaRech();
}
