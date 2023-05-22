package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResponsableRepository extends JpaRepository<Responsable, Long> {
    Optional<Responsable> findResponsableById(Long id);
    void deleteResponsableById(Long id);
}
