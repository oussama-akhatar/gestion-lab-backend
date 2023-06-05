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
public class ProjetMembre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dotateurProjet;
	private boolean responsableProjet;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Projet projet;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Membre membre;
}
