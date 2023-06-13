package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.entities.Responsable;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpressionBesoinRepository extends JpaRepository<ExpressionBesoin, Long> {
	Optional<ExpressionBesoin> findExpressionBesoinById(Long id);

	void deleteExpressionBesoinById(Long id);
	
	
	List<ExpressionBesoin> findAllByResponsableAndValiderDirecteurTrue(Responsable responsable);
}
