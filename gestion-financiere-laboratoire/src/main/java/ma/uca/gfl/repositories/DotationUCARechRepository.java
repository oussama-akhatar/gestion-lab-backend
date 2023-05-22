package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.DotationUCARech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DotationUCARechRepository extends JpaRepository<DotationUCARech, Long> {
    void deleteDotationUCARechById(Long id);
    Optional<DotationUCARech> findDotationUCARechById(Long id);
}
