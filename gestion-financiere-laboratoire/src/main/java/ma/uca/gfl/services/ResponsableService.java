package ma.uca.gfl.services;

import ma.uca.gfl.entities.Projet;
import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.repositories.ResponsableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableService {
    private final ResponsableRepository responsableRepository;

    public ResponsableService(ResponsableRepository responsableRepository) {
        this.responsableRepository = responsableRepository;
    }

    public Responsable addResponsable(Responsable responsable){
        return responsableRepository.save(responsable);
    }

    public List<Responsable> findAllResponsables(){
        return responsableRepository.findAll();
    }

    public Responsable updateResponsable(Responsable responsable){
        return responsableRepository.save(responsable);
    }

    public Responsable findResponsableById(Long id){
        return responsableRepository.findResponsableById(id).get();
    }

    public void deleteResponsable(Long id) {
        responsableRepository.deleteResponsableById(id);
    }
}
