package ma.uca.gfl.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import ma.uca.gfl.enums.TypeResponsabilite;

@Entity
@Data
public class Responsable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String email;
	private String telephone;
	@Enumerated(EnumType.STRING)
	private TypeResponsabilite typeResponsabilite;

	@OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<ExpressionBesoin> expressionBesoins;
}
