package ma.uca.gfl.services;

import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.entities.TypeBesoin;
import ma.uca.gfl.repositories.TypeBesoinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeBesoinService {
    private final TypeBesoinRepository typeBesoinRepository;

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
        return typeBesoinRepository.findTypeBesoinById(id).get();
    }

    public void deleteTypeBesoin(Long id) {
        typeBesoinRepository.deleteTypeBesoinById(id);
    }
}
