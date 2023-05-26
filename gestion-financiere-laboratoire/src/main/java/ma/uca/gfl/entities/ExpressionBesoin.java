package ma.uca.gfl.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ExpressionBesoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private boolean validerDirecteur;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Membre membre;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private TypeBesoin typeBesoin;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Responsable responsable;

}
