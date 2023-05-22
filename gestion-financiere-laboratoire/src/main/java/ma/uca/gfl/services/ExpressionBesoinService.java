package ma.uca.gfl.services;

import ma.uca.gfl.entities.DotationUCARech;
import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.repositories.ExpressionBesoinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressionBesoinService {
    private final ExpressionBesoinRepository expressionBesoinRepository;

    public ExpressionBesoinService(ExpressionBesoinRepository expressionBesoinRepository) {
        this.expressionBesoinRepository = expressionBesoinRepository;
    }

    public ExpressionBesoin addExpressionBesoin(ExpressionBesoin expressionBesoin){
        return expressionBesoinRepository.save(expressionBesoin);
    }

    public List<ExpressionBesoin> findAllExpressionBesoins(){
        return expressionBesoinRepository.findAll();
    }

    public ExpressionBesoin updateExpressionBesoin(ExpressionBesoin expressionBesoin){
        return expressionBesoinRepository.save(expressionBesoin);
    }

    public ExpressionBesoin findExpressionBesoinById(Long id){
        return expressionBesoinRepository.findExpressionBesoinById(id).get();
    }

    public void deleteExpressionBesoin(Long id) {
        expressionBesoinRepository.deleteExpressionBesoinById(id);
    }
}
