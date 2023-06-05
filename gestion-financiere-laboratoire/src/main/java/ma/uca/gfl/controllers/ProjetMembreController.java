package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.ProjetMembre;
import ma.uca.gfl.services.ProjetMembreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetMembre")
public class ProjetMembreController {
	private final ProjetMembreService projetMembreService;

	public ProjetMembreController(ProjetMembreService projetMembreService) {
		this.projetMembreService = projetMembreService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<ProjetMembre>> getAllProjetMembres() {
		List<ProjetMembre> projetMembres = projetMembreService.findAllProjetMembres();
		return new ResponseEntity<>(projetMembres, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<ProjetMembre> getProjetMembreById(@PathVariable("id") Long id) {
		ProjetMembre projetMembre = projetMembreService.findProjetMembreById(id);
		return new ResponseEntity<>(projetMembre, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<ProjetMembre> addProjetMembre(@RequestBody ProjetMembre projetMembre) {
		ProjetMembre newProjetMembre = projetMembreService.addProjetMembre(projetMembre);
		return new ResponseEntity<>(newProjetMembre, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<ProjetMembre> updateProjetMembre(@RequestBody ProjetMembre projetMembre) {
		ProjetMembre updateProjetMembre = projetMembreService.updateProjetMembre(projetMembre);
		return new ResponseEntity<>(updateProjetMembre, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProjetMembre(@PathVariable("id") Long id) {
		projetMembreService.deleteProjetMembre(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
