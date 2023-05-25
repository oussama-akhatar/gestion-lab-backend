package ma.uca.gfl.services;

import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.entities.Membre;
import ma.uca.gfl.repositories.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreService {
    private final MembreRepository membreRepository;

    public MembreService(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

    public Membre addMembre(Membre membre){
        return membreRepository.save(membre);
    }

    public List<Membre> findAllMembres(){
        return membreRepository.findAll();
    }

    public Membre updateMembre(Membre membre){
        return membreRepository.save(membre);
    }

    public Membre findMembreById(Long id){
        return membreRepository.findMembreById(id).get();
    }

    public void deleteMembre(Long id) {
        membreRepository.deleteMembreById(id);
    }
}
