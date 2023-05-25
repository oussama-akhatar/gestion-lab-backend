package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.MembreDotationUCARech;
import ma.uca.gfl.services.MembreDotationUCARechService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membreDotationUCARech")
public class MembreDotationUCARechController {
    private final MembreDotationUCARechService membreDotationUCARechService;

    public MembreDotationUCARechController(MembreDotationUCARechService membreDotationUCARechService) {
        this.membreDotationUCARechService = membreDotationUCARechService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MembreDotationUCARech>> getAllMembreDotationUCARechs() {
        List<MembreDotationUCARech> membreDotationUCAReches = membreDotationUCARechService.findAllMembreDotationUCARechServices();
        return new ResponseEntity<>(membreDotationUCAReches, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<MembreDotationUCARech> getMembreDotationUCARechById(@PathVariable("id") Long id){
        MembreDotationUCARech membreDotationUCARech = membreDotationUCARechService.findMembreDotationUCARechServiceById(id);
        return new ResponseEntity<>(membreDotationUCARech, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<MembreDotationUCARech> addMembreDotationUCARech(@RequestBody MembreDotationUCARech membreDotationUCARech) {
        MembreDotationUCARech newMembreDotationUCARech = membreDotationUCARechService.addMembreDotationUCARechService(membreDotationUCARech);
        return new ResponseEntity<>(newMembreDotationUCARech, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<MembreDotationUCARech> updateMembreDotationUCARech(@RequestBody MembreDotationUCARech membreDotationUCARech) {
        MembreDotationUCARech updateMembreDotationUCARech = membreDotationUCARechService.updateMembreDotationUCARechService(membreDotationUCARech);
        return new ResponseEntity<>(updateMembreDotationUCARech, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMembreDotationUCARech(@PathVariable("id") Long id) {
        membreDotationUCARechService.deleteMembreDotationUCARechService(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
