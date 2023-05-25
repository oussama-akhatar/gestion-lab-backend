package ma.uca.gfl.services;

import ma.uca.gfl.entities.DotationUCARech;
import ma.uca.gfl.repositories.DotationUCARechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DotationUCARechService {
    private final DotationUCARechRepository dotationUCARechRepository;

    @Autowired
    public DotationUCARechService(DotationUCARechRepository dotationUCARechRepository) {this.dotationUCARechRepository = dotationUCARechRepository;}

    public DotationUCARech addDotationUCARech(DotationUCARech dotationUCARech){return dotationUCARechRepository.save(dotationUCARech);}

    public List<DotationUCARech> findAllDotationUCARechs(){
        return dotationUCARechRepository.findAll();
    }

    public DotationUCARech updateDotationUCARech(DotationUCARech dotationUCARech){return dotationUCARechRepository.save(dotationUCARech);}

    public DotationUCARech findDotationUCARechById(Long id){return dotationUCARechRepository.findDotationUCARechById(id).get();}

    public void deleteDotationUCARech(Long id) {
        dotationUCARechRepository.deleteDotationUCARechById(id);
    }
}
