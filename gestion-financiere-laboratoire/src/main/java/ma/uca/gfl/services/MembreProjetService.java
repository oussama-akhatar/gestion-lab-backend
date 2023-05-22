package ma.uca.gfl.services;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.entities.MembreProjet;
import ma.uca.gfl.repositories.MembreProjetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreProjetService {
    private final MembreProjetRepository membreProjetRepository;

    public MembreProjetService(MembreProjetRepository membreProjetRepository) {
        this.membreProjetRepository = membreProjetRepository;
    }

    public MembreProjet addMembreProjet(MembreProjet membreProjet){
        return membreProjetRepository.save(membreProjet);
    }

    public List<MembreProjet> findAllMembreProjets(){
        return membreProjetRepository.findAll();
    }

    public MembreProjet updateMembreProjet(MembreProjet membreProjet){
        return membreProjetRepository.save(membreProjet);
    }

    public MembreProjet findMembreProjetById(Long id){
        return membreProjetRepository.findMembreProjetById(id).get();
    }

    public void deleteMembreProjet(Long id) {
        membreProjetRepository.deleteMembreProjetById(id);
    }
}
