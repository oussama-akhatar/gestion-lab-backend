package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Laboratoire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LaboratoireRepository extends JpaRepository<Laboratoire, Long> {
    Optional<Laboratoire> findLaboratoireById(Long id);
    void deleteLaboratoireById(Long id);
}
