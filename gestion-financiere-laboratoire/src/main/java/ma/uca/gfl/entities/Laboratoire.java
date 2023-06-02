package ma.uca.gfl.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
<<<<<<< HEAD
//	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
=======
>>>>>>> 3c22d09ace7b1e9f8f7d585680426716f006632d
	@JsonIgnoreProperties("laboratoires")
	private Etablissement etablissement;

	@OneToMany(mappedBy = "laboratoire", cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<Membre> membres;

}
