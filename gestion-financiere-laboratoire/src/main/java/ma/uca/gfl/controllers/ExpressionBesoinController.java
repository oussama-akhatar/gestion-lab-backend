package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.entities.Responsable;
import ma.uca.gfl.services.ExpressionBesoinService;
import ma.uca.gfl.services.ResponsableService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expressionBesoin")
public class ExpressionBesoinController {
	private final ExpressionBesoinService expressionBesoinService;
	private ResponsableService responsableService;

	public ExpressionBesoinController(ExpressionBesoinService expressionBesoinService,
			ResponsableService responsableService) {
		this.expressionBesoinService = expressionBesoinService;
		this.responsableService = responsableService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<ExpressionBesoin>> getAllExpressionBesoins() {
		List<ExpressionBesoin> expressionBesoins = expressionBesoinService.findAllExpressionBesoins();
		return new ResponseEntity<>(expressionBesoins, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<ExpressionBesoin> getExpressionBesoinById(@PathVariable("id") Long id) {
		ExpressionBesoin expressionBesoin = expressionBesoinService.findExpressionBesoinById(id);
		return new ResponseEntity<>(expressionBesoin, HttpStatus.OK);
	}

	@GetMapping("/all/resp/{id}")
	public ResponseEntity<List<ExpressionBesoin>> getEBsByResponsable(@PathVariable("id") Long id) {
		Responsable responsable = responsableService.findResponsableById(id);
		List<ExpressionBesoin> expressionBesoins = expressionBesoinService.findByResponsable(responsable);
		return new ResponseEntity<>(expressionBesoins, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<ExpressionBesoin> addExpressionBesoin(@RequestBody ExpressionBesoin expressionBesoin) {
		ExpressionBesoin newExpressionBesoin = expressionBesoinService.addExpressionBesoin(expressionBesoin);
		return new ResponseEntity<>(newExpressionBesoin, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<ExpressionBesoin> updateExpressionBesoin(@RequestBody ExpressionBesoin expressionBesoin) {
		ExpressionBesoin updateExpressionBesoin = expressionBesoinService.updateExpressionBesoin(expressionBesoin);
		return new ResponseEntity<>(updateExpressionBesoin, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteExpressionBesoin(@PathVariable("id") Long id) {
		expressionBesoinService.deleteExpressionBesoin(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
