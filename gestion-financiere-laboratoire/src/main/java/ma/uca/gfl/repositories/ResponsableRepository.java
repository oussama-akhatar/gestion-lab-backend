package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.enums.TypeResponsabilite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ResponsableRepository extends JpaRepository<Responsable, Long> {
	Optional<Responsable> findResponsableById(Long id);

	void deleteResponsableById(Long id);

}
