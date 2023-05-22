package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.MembreDotationUCARech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembreDotationUCARechRepository extends JpaRepository<MembreDotationUCARech, Long> {
    Optional<MembreDotationUCARech> findMembreDotationUCARechById(Long id);
    void deleteMembreDotationUCARechById(Long id);
}
