package ma.uca.gfl.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laboratoire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	private String departement;

	@ManyToOne
    @JoinColumn(name = "etablissement_id")
	@JsonIgnoreProperties("laboratoires")
	private Etablissement etablissement;

	@OneToMany(mappedBy = "laboratoire", cascade = CascadeType.ALL)
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JsonIgnoreProperties("laboratoire")
	private List<Membre> membres;

}
