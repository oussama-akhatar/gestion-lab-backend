package ma.uca.gfl.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MembreProjet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dotateurProjet;
	private boolean isResponsableProjet;

	@ManyToOne
	private Projet projet;

	@ManyToOne
	private Membre membre;
}
