package ma.uca.gfl.entities;

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
	private Membre membre;
	@ManyToOne
	private DotationUCARech dotationUCARech;

}
