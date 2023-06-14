package ma.uca.gfl.controllers;

import lombok.AllArgsConstructor;
import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.repositories.DotationUCARechRepository;
import ma.uca.gfl.repositories.EtablissementRepository;
import ma.uca.gfl.repositories.LaboratoireRepository;
import ma.uca.gfl.repositories.MembreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {
    private EtablissementRepository etablissementRepository;
    private LaboratoireRepository laboratoireRepository;
    private DotationUCARechRepository dotationUCARechRepository;
    private MembreRepository membreRepository;

    @GetMapping("/etablissement/countEtablissement")
    public ResponseEntity<Long> countEtablissement() {
        long count = etablissementRepository.count();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/laboratoire/countLaboratoire")
    public ResponseEntity<Long> countLaboratoire() {
        long count = laboratoireRepository.count();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/laboratoire/etablissement")
    public ResponseEntity<Object> counLaboratoiretByEtablissement() {
        Object count = laboratoireRepository.countAllLaboratoireGroupByEtablissement();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/sommeDotationUcaRech")
    public ResponseEntity<Double> sommeDotationUcaRech() {
        double count = dotationUCARechRepository.sumDotationsUcaRech();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/countMembre")
    public ResponseEntity<Long> countMembre() {
        Long count = membreRepository.count();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

}
