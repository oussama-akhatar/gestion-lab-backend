package ma.uca.gfl.services;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.entities.Laboratoire;
import ma.uca.gfl.repositories.LaboratoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratoireService {
    private final LaboratoireRepository laboratoireRepository;
    @Autowired
    public LaboratoireService(LaboratoireRepository laboratoireRepository) {
        this.laboratoireRepository = laboratoireRepository;
    }

    public Laboratoire addLaboratoire(Laboratoire laboratoire){
        return laboratoireRepository.save(laboratoire);
    }

    public List<Laboratoire> findAllLaboratoires(){
        return laboratoireRepository.findAll();
    }

    public Laboratoire updateLaboratoire(Laboratoire etablissement){
        return laboratoireRepository.save(etablissement);
    }

    public Laboratoire findLaboratoireById(Long id){
        return laboratoireRepository.findLaboratoireById(id).get();
    }

    public void deleteLaboratoire(Long id) {
        laboratoireRepository.deleteLaboratoireById(id);
    }
}
