package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Laboratoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LaboratoireRepository extends JpaRepository<Laboratoire, Long> {
    Optional<Laboratoire> findLaboratoireById(Long id);
    void deleteLaboratoireById(Long id);

    @Query("SELECT e.intitule,count(l) from Laboratoire l, Etablissement e WHERE l.etablissement=e GROUP BY e")
    List<Object> countAllLaboratoireGroupByEtablissement();
}
