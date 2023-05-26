package ma.uca.gfl.services;

import ma.uca.gfl.entities.MembreProjet;
import ma.uca.gfl.repositories.MembreProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MembreProjetService {
    private final MembreProjetRepository membreProjetRepository;

    @Autowired
    public MembreProjetService(MembreProjetRepository membreProjetRepository) {this.membreProjetRepository = membreProjetRepository;}

    public MembreProjet addMembreProjet(MembreProjet membreProjet){return membreProjetRepository.save(membreProjet);}

    public List<MembreProjet> findAllMembreProjets(){
        return membreProjetRepository.findAll();
    }

    public MembreProjet updateMembreProjet(MembreProjet membreProjet){return membreProjetRepository.save(membreProjet);}

    public MembreProjet findMembreProjetById(Long id){
        return membreProjetRepository.findMembreProjetById(id).orElseThrow();
    }

    @Transactional
    public void deleteMembreProjet(Long id) {
        membreProjetRepository.deleteMembreProjetById(id);
    }
}
