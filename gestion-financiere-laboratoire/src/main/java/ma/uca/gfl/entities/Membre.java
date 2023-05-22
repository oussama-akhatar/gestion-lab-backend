package ma.uca.gfl.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

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
	private Laboratoire laboratoire;

	@OneToMany(mappedBy = "membre")
	private List<MembreDotationUCARech> membreDotationUCARechs;

	@OneToMany(mappedBy = "membre")
	private List<MembreProjet> membreProjets;

	@OneToMany(mappedBy = "membre")
	private List<ExpressionBesoin> expressionBesoins;

}
