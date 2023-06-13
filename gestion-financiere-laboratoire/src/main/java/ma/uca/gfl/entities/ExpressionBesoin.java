package ma.uca.gfl.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class ExpressionBesoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private boolean validerDirecteur;
	private double montant;
	private double montantEffectif;
	@Temporal(TemporalType.DATE)
	private Date dateDemande;
	@Temporal(TemporalType.DATE)
	private Date dateValidation;

	@ManyToOne
	@JsonIgnoreProperties(value = "expressionBesoins", allowSetters = true)
	private Membre membre;

	@ManyToOne
	@JsonIgnoreProperties(value = "expressionBesoins", allowSetters = true)
	private TypeBesoin typeBesoin;

	@ManyToOne
	@JsonIgnoreProperties(value = "expressionBesoins", allowSetters = true)
	private Responsable responsable;

}
