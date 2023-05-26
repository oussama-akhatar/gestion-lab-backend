package ma.uca.gfl.services;

import ma.uca.gfl.entities.MembreDotationUCARech;
import ma.uca.gfl.repositories.MembreDotationUCARechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MembreDotationUCARechService {
    private final MembreDotationUCARechRepository dotationUCARechRepository;

    @Autowired
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
        return dotationUCARechRepository.findMembreDotationUCARechById(id).orElseThrow();
    }

    @Transactional
    public void deleteMembreDotationUCARechService(Long id) {
        dotationUCARechRepository.deleteMembreDotationUCARechById(id);
    }
}
