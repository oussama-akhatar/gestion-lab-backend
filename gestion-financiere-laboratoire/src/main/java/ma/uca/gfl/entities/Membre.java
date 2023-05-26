package ma.uca.gfl.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
public class Membre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissane;
	private String email;
	private String telephone;
	private boolean isDirecteur;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Laboratoire laboratoire;

	@OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private List<MembreDotationUCARech> membreDotationUCARechs;

	@OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private List<MembreProjet> membreProjets;

	@OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private List<ExpressionBesoin> expressionBesoins;

}
