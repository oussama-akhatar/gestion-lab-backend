package ma.uca.gfl.services;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.entities.MembreDotationUCARech;
import ma.uca.gfl.repositories.MembreDotationUCARechRepository;

import java.util.List;

public class MembreDotationUCARechService {
    private final MembreDotationUCARechRepository dotationUCARechRepository;

    public MembreDotationUCARechService(MembreDotationUCARechRepository membreDotationUCARechRepository){
        this.dotationUCARechRepository = membreDotationUCARechRepository;
    }

    public MembreDotationUCARech addMembreDotationUCARechService(MembreDotationUCARech membreDotationUCARech){
        return dotationUCARechRepository.save(membreDotationUCARech);
    }

    public List<MembreDotationUCARech> findAllMembreDotationUCARechServices(){
        return dotationUCARechRepository.findAll();
    }

    public MembreDotationUCARech updateMembreDotationUCARechService(MembreDotationUCARech membreDotationUCARech){
        return dotationUCARechRepository.save(membreDotationUCARech);
    }

    public MembreDotationUCARech findMembreDotationUCARechServiceById(Long id){
        return dotationUCARechRepository.findMembreDotationUCARechById(id).get();
    }

    public void deleteMembreDotationUCARechService(Long id) {
        dotationUCARechRepository.deleteMembreDotationUCARechById(id);
    }
}
