package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    void deleteProjetById(Long id);
    Optional<Projet> findProjetById(Long id);
}
