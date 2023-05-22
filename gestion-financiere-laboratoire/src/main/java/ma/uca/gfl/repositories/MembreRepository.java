package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembreRepository extends JpaRepository<Membre,Long> {
    Optional<Membre> findMembreById(Long id);
    void deleteMembreById(Long id);
}
