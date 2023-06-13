package ma.uca.gfl.repositories;

import ma.uca.gfl.entities.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface ExpressionBesoinRepository extends JpaRepository<ExpressionBesoin, Long> {
    Optional<ExpressionBesoin> findExpressionBesoinById(Long id);
    void deleteExpressionBesoinById(Long id);
}
