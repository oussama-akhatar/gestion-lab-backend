package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.Membre;
import ma.uca.gfl.services.MembreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membre")
public class MembreController {

    private final MembreService membreService;

    public MembreController(MembreService membreService) {
        this.membreService = membreService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Membre>> getAllMembres() {
        List<Membre> membres = membreService.findAllMembres();
        return new ResponseEntity<>(membres, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Membre> addMembre(@RequestBody Membre membre) {
        Membre newMembre = membreService.addMembre(membre);
        return new ResponseEntity<>(newMembre, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Membre> getMembreById(@PathVariable("id") Long id){
        Membre laboratoire = membreService.findMembreById(id);
        return new ResponseEntity<>(laboratoire, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Membre> updateMembre(@RequestBody Membre membre) {
        Membre updateMembre = membreService.updateMembre(membre);
        return new ResponseEntity<>(updateMembre, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMembre(@PathVariable("id") Long id) {
        membreService.deleteMembre(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
