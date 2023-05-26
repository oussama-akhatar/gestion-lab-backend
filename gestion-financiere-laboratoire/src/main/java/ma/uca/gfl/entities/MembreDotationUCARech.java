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
public class MembreDotationUCARech {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dotationMembre;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Membre membre;
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private DotationUCARech dotationUCARech;

}
