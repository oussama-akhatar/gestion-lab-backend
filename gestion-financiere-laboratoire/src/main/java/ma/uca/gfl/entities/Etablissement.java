package ma.uca.gfl.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Etablissement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	private String adresse;


//	@OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL)
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

	@OneToMany(mappedBy = "etablissement" ,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("etablissement")
	private List<Laboratoire> laboratoires;

}
