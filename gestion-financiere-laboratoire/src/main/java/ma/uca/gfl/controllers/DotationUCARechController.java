package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.DotationUCARech;
import ma.uca.gfl.services.DotationUCARechService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("dotationUCARech")
public class DotationUCARechController {
    private final DotationUCARechService dotationUCARechService;
    public DotationUCARechController(DotationUCARechService dotationUCARechService) {
        this.dotationUCARechService = dotationUCARechService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<DotationUCARech>> getAllDotationUCARechs() {
        List<DotationUCARech> dotationUCAReches = dotationUCARechService.findAllDotationUCARechs();
        return new ResponseEntity<>(dotationUCAReches, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<DotationUCARech> getEtablissementById(@PathVariable("id") Long id){
        DotationUCARech dotationUCARech = dotationUCARechService.findDotationUCARechById(id);
        return new ResponseEntity<>(dotationUCARech, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<DotationUCARech> addEmployee(@RequestBody DotationUCARech dotationUCARech) {
        DotationUCARech newDotationUCARech = dotationUCARechService.addDotationUCARech(dotationUCARech);
        return new ResponseEntity<>(newDotationUCARech, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<DotationUCARech> updateEmployee(@RequestBody DotationUCARech dotationUCARech) {
        DotationUCARech updateDotationUCARech = dotationUCARechService.updateDotationUCARech(dotationUCARech);
        return new ResponseEntity<>(updateDotationUCARech, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEtablissement(@PathVariable("id") Long id) {
        dotationUCARechService.deleteDotationUCARech(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
