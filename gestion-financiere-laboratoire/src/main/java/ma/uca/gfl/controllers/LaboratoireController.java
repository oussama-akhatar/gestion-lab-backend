package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.Laboratoire;
import ma.uca.gfl.services.EtablissementService;
import ma.uca.gfl.services.LaboratoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratoire")
public class LaboratoireController {
    private final LaboratoireService laboratoireService;
    @Autowired
    public LaboratoireController(LaboratoireService laboratoireService) {
        this.laboratoireService = laboratoireService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Laboratoire>> getAllLaboratoires() {
        List<Laboratoire> laboratoires = laboratoireService.findAllLaboratoires();
        return new ResponseEntity<>(laboratoires, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Laboratoire> addLaboratoire(@RequestBody Laboratoire laboratoire) {
        Laboratoire newLaboratoire = laboratoireService.addLaboratoire(laboratoire);
        return new ResponseEntity<>(newLaboratoire, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Laboratoire> getLaboratoireById(@PathVariable("id") Long id){
        Laboratoire laboratoire = laboratoireService.findLaboratoireById(id);
        return new ResponseEntity<>(laboratoire, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Laboratoire> updateLaboratoire(@RequestBody Laboratoire laboratoire) {
        Laboratoire updateLaboratoire = laboratoireService.updateLaboratoire(laboratoire);
        return new ResponseEntity<>(updateLaboratoire, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLaboratoire(@PathVariable("id") Long id) {
        laboratoireService.deleteLaboratoire(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
