package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.entities.ResponsableAffaireFinanciere;
import ma.uca.gfl.entities.ResponsableMarche;
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
	public ResponseEntity<Responsable> getResponsableById(@PathVariable("id") Long id) {
		Responsable responsable = responsableService.findResponsableById(id);
		return new ResponseEntity<>(responsable, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Responsable> addResponsable(@RequestBody Responsable responsable) {
		Responsable newResponsable = new Responsable();
		if (responsable.getType().equals("RA")) {
			ResponsableAffaireFinanciere responsableAffaireFinanciere = new ResponsableAffaireFinanciere();
			responsableAffaireFinanciere.setNom(responsable.getNom());
			responsableAffaireFinanciere.setPrenom(responsable.getPrenom());
			responsableAffaireFinanciere.setDateNaissance(responsable.getDateNaissance());
			responsableAffaireFinanciere.setEmail(responsable.getEmail());
			responsableAffaireFinanciere.setTelephone(responsable.getTelephone());
			newResponsable = responsableService.addResponsable(responsableAffaireFinanciere);
		} else if (responsable.getType().equals("RM")) {
			ResponsableMarche responsableMarche = new ResponsableMarche();
			responsableMarche.setNom(responsable.getNom());
			responsableMarche.setPrenom(responsable.getPrenom());
			responsableMarche.setDateNaissance(responsable.getDateNaissance());
			responsableMarche.setEmail(responsable.getEmail());
			responsableMarche.setTelephone(responsable.getTelephone());
			newResponsable = responsableService.addResponsable(responsableMarche);
		} else {
			throw new IllegalArgumentException("Unsupported type of Responsable");
		}

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
