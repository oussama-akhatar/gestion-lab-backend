package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.MembreProjet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembreProjetRepository extends JpaRepository<MembreProjet, Long> {
    Optional<MembreProjet> findMembreProjetById(Long id);
    void deleteMembreProjetById(Long id);
}
