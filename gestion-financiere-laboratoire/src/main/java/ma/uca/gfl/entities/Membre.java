package ma.uca.gfl.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
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
	private Date dateNaissance;
	private String email;
	private String password;
	private String telephone;
	private boolean directeur;

	@ManyToOne
	@JsonIgnoreProperties("membres")
	private Laboratoire laboratoire;

	@OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = "membre")
	private List<MembreDotationUCARech> membreDotationUCARechs;

	@OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = "membre")
	private List<ProjetMembre> projetMembres;

	@OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = "membre")
	private List<ExpressionBesoin> expressionBesoins;

}
