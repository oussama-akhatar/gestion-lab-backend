package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.Etablissement;
import ma.uca.gfl.services.EtablissementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping("/etablissement")
public class EtablissementController {
    private final EtablissementService etablissementService;
    public EtablissementController(EtablissementService etablissementService) {
        this.etablissementService = etablissementService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Etablissement>> getAllEtablissements() {
        List<Etablissement> etablissements = etablissementService.findAllEtablissements();
        return new ResponseEntity<>(etablissements, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Etablissement> getEtablissementById(@PathVariable("id") Long id){
        Etablissement etablissement = etablissementService.findEtablissementById(id);
        return new ResponseEntity<>(etablissement, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Etablissement> addEtablissement(@RequestBody Etablissement etablissement) {
        Etablissement newEtablissement = etablissementService.addEtablissement(etablissement);
        return new ResponseEntity<>(newEtablissement, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Etablissement> updateEtablissement(@RequestBody Etablissement etablissement) {
        Etablissement updateEtablissement = etablissementService.updateEtablissement(etablissement);
        return new ResponseEntity<>(updateEtablissement, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEtablissement(@PathVariable("id") Long id) {
        etablissementService.deleteEtalissement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
