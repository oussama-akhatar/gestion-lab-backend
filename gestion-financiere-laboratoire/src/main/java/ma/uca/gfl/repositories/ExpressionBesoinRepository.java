package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExpressionBesoinRepository extends JpaRepository<ExpressionBesoin, Long> {
    Optional<ExpressionBesoin> findExpressionBesoinById(Long id);
    void deleteExpressionBesoinById(Long id);
}
