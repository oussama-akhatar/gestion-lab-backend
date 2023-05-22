package ma.uca.gfl.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class DotationUCARech {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String annee;
	private String dotateurBase;

	@OneToMany(mappedBy = "dotationUCARech")
	private List<MembreDotationUCARech> membreDotationUCARechs;

}
