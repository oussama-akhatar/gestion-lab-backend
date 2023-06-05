package ma.uca.gfl.controllers;

import ma.uca.gfl.entities.ExpressionBesoin;
import ma.uca.gfl.services.ExpressionBesoinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expressionBesoin")
public class ExpressionBesoinController {
	private final ExpressionBesoinService expressionBesoinService;

	public ExpressionBesoinController(ExpressionBesoinService expressionBesoinService) {
		this.expressionBesoinService = expressionBesoinService;
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
