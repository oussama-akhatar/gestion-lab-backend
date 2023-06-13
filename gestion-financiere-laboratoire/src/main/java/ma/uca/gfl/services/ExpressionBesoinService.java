package ma.uca.gfl.services;

import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.repositories.ExpressionBesoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ExpressionBesoinService {
	private final ExpressionBesoinRepository expressionBesoinRepository;

	@Autowired
	public ExpressionBesoinService(ExpressionBesoinRepository expressionBesoinRepository) {
		this.expressionBesoinRepository = expressionBesoinRepository;
	}

	public ExpressionBesoin addExpressionBesoin(ExpressionBesoin expressionBesoin) {
		return expressionBesoinRepository.save(expressionBesoin);
	}

	public List<ExpressionBesoin> findAllExpressionBesoins() {
		return expressionBesoinRepository.findAll();
	}

	public List<ExpressionBesoin> findByResponsable(Responsable responsable) {
		return expressionBesoinRepository.findAllByResponsableAndValiderDirecteurTrue(responsable);
	}

	public ExpressionBesoin updateExpressionBesoin(ExpressionBesoin expressionBesoin) {
		ExpressionBesoin eb = expressionBesoinRepository.findById(expressionBesoin.getId()).orElse(null);
		eb.setMontantEffectif(expressionBesoin.getMontantEffectif());
		eb.setDateValidation(new Date());
		return expressionBesoinRepository.save(eb);
	}

	public ExpressionBesoin findExpressionBesoinById(Long id) {
		return expressionBesoinRepository.findExpressionBesoinById(id).orElseThrow();
	}

	@Transactional
	public void deleteExpressionBesoin(Long id) {
		expressionBesoinRepository.deleteExpressionBesoinById(id);
	}
}
