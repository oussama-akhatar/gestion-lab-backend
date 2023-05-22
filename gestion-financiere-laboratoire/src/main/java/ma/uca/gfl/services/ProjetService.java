package ma.uca.gfl.services;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.entities.Projet;
import ma.uca.gfl.repositories.ProjetRepository;

import java.util.List;

public class ProjetService {
    private final ProjetRepository projetRepository;

    public ProjetService(ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }

    public Projet addProjet(Projet projet){
        return projetRepository.save(projet);
    }

    public List<Projet> findAllProjets(){
        return projetRepository.findAll();
    }

    public Projet updateProjet(Projet projet){
        return projetRepository.save(projet);
    }

    public Projet findProjetById(Long id){
        return projetRepository.findProjetById(id).get();
    }

    public void deleteProjet(Long id) {
        projetRepository.deleteProjetById(id);
    }
}
