package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Laboratoire;
import ma.uca.gfl.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MembreRepository extends JpaRepository<Membre,Long> {
    Optional<Membre> findMembreById(Long id);
    void deleteMembreById(Long id);
    List<Membre> findAllByDirecteurIsTrue();
    @Query("SELECT m FROM Membre m WHERE m.laboratoire.id = :id AND m.directeur=false ")
    List<Membre> findAllByLaboratoire(@Param("id") Long id);
}
