package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.ProjetMembre;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjetMembreRepository extends JpaRepository<ProjetMembre, Long> {
	Optional<ProjetMembre> findProjetMembreById(Long id);

	void deleteProjetMembreById(Long id);

}
