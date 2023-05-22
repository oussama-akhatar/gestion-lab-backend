package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.TypeBesoin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeBesoinRepository extends JpaRepository<TypeBesoin, Long> {
    void deleteTypeBesoinById(Long id);
    Optional<TypeBesoin> findTypeBesoinById(Long id);
}
