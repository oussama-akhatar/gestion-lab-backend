package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.Laboratoire;
import ma.uca.gfl.entities.TypeBesoin;
import ma.uca.gfl.services.TypeBesoinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeBesoin")
public class TypeBesoinController {
    private final TypeBesoinService typeBesoinService;
    public TypeBesoinController(TypeBesoinService typeBesoinService) {
        this.typeBesoinService = typeBesoinService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<TypeBesoin>> getAllTypeBesoin() {
        List<TypeBesoin> typeBesoins = typeBesoinService.findAllTypeBesoins();
        return new ResponseEntity<>(typeBesoins, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<TypeBesoin> addTypeBesoin(@RequestBody TypeBesoin typeBesoin) {
        TypeBesoin newTypeBesoin = typeBesoinService.addTypeBesoin(typeBesoin);
        return new ResponseEntity<>(newTypeBesoin,HttpStatus.CREATED);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<TypeBesoin> getTypeBesoinById(@PathVariable("id") Long id){
        TypeBesoin typeBesoin = typeBesoinService.findTypeBesoinById(id);
        return new ResponseEntity<>(typeBesoin, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<TypeBesoin> updateTypeBesoin(@RequestBody TypeBesoin typeBesoin) {
        TypeBesoin updateTypeBesoin = typeBesoinService.updateTypeBesoin(typeBesoin);
        return new ResponseEntity<>(updateTypeBesoin, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTypeBesoin(@PathVariable("id") Long id) {
        typeBesoinService.deleteTypeBesoin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
