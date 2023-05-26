package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.services.ResponsableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsable")
public class ResponsableController {
    private final ResponsableService responsableService;

    public ResponsableController(ResponsableService responsableService) {
        this.responsableService = responsableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Responsable>> getAllResponsables() {
        List<Responsable> responsables = responsableService.findAllResponsables();
        return new ResponseEntity<>(responsables, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Responsable> getResponsableById(@PathVariable("id") Long id){
        Responsable responsable = responsableService.findResponsableById(id);
        return new ResponseEntity<>(responsable, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Responsable> addResponsable(@RequestBody Responsable responsable) {
        Responsable newResponsable = responsableService.addResponsable(responsable);
        return new ResponseEntity<>(newResponsable, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Responsable> updateResponsable(@RequestBody Responsable responsable) {
        Responsable updateResponsable = responsableService.updateResponsable(responsable);
        return new ResponseEntity<>(updateResponsable, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEtablissement(@PathVariable("id") Long id) {
        responsableService.deleteResponsable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}