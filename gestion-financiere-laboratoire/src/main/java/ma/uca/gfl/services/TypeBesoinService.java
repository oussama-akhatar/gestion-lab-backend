package ma.uca.gfl.services;

import ma.uca.gfl.entities.TypeBesoin;
import ma.uca.gfl.repositories.TypeBesoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeBesoinService {
    private final TypeBesoinRepository typeBesoinRepository;
    @Autowired
    public TypeBesoinService(TypeBesoinRepository typeBesoinRepository) {
        this.typeBesoinRepository = typeBesoinRepository;
    }

    public TypeBesoin addTypeBesoin(TypeBesoin typeBesoin){
        return typeBesoinRepository.save(typeBesoin);
    }

    public List<TypeBesoin> findAllTypeBesoins(){
        return typeBesoinRepository.findAll();
    }

    public TypeBesoin updateTypeBesoin(TypeBesoin typeBesoin){
        return typeBesoinRepository.save(typeBesoin);
    }

    public TypeBesoin findTypeBesoinById(Long id){
        return typeBesoinRepository.findTypeBesoinById(id).orElseThrow();
    }

    @Transactional
    public void deleteTypeBesoin(Long id) {
        typeBesoinRepository.deleteTypeBesoinById(id);
    }
}
