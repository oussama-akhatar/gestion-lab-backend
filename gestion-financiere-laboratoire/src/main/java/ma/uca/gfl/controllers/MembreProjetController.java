package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.MembreProjet;
import ma.uca.gfl.services.MembreProjetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membreProjet")
public class MembreProjetController {
    private final MembreProjetService projetService;
    public MembreProjetController(MembreProjetService projetService) {
        this.projetService = projetService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<MembreProjet>> getAllMembreProjets() {
        List<MembreProjet> membreProjets = projetService.findAllMembreProjets();
        return new ResponseEntity<>(membreProjets, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<MembreProjet> getMembreProjetById(@PathVariable("id") Long id){
        MembreProjet membreProjet = projetService.findMembreProjetById(id);
        return new ResponseEntity<>(membreProjet, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<MembreProjet> addMembreProjet(@RequestBody MembreProjet membreProjet) {
        MembreProjet newMembreProjet = projetService.addMembreProjet(membreProjet);
        return new ResponseEntity<>(newMembreProjet, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<MembreProjet> updateMembreProjet(@RequestBody MembreProjet membreProjet) {
        MembreProjet updateMembreProjet = projetService.updateMembreProjet(membreProjet);
        return new ResponseEntity<>(updateMembreProjet, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMembreProjet(@PathVariable("id") Long id) {
        projetService.deleteMembreProjet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
