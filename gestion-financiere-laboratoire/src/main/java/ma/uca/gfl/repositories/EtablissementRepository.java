package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.Etablissement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
    void deleteEtablissementById(Long id);
    Optional<Etablissement> findEtablissementById(Long id);
    Page<Etablissement> findAll(Pageable pageable);

}
